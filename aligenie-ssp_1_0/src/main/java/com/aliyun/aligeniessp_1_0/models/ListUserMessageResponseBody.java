// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public java.util.List<ListUserMessageResponseBodyResult> result;

    public static ListUserMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserMessageResponseBody self = new ListUserMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserMessageResponseBody setResult(java.util.List<ListUserMessageResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserMessageResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListUserMessageResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-27 14:06:27.000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("Pic")
        public String pic;

        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>AF188<strong>065EE4B</strong>DD68CE**951D84D4</p>
         */
        @NameInMap("SourceUuid")
        public String sourceUuid;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListUserMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserMessageResponseBodyResult self = new ListUserMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserMessageResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListUserMessageResponseBodyResult setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListUserMessageResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserMessageResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserMessageResponseBodyResult setPic(String pic) {
            this.pic = pic;
            return this;
        }
        public String getPic() {
            return this.pic;
        }

        public ListUserMessageResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUserMessageResponseBodyResult setSourceUuid(String sourceUuid) {
            this.sourceUuid = sourceUuid;
            return this;
        }
        public String getSourceUuid() {
            return this.sourceUuid;
        }

        public ListUserMessageResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserMessageResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserMessageResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
