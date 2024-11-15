// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListCallbackResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListCallbackResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackResponseBody self = new ListCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallbackResponseBody setData(java.util.List<ListCallbackResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCallbackResponseBodyData> getData() {
        return this.data;
    }

    public ListCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallbackResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SHA256</p>
         */
        @NameInMap("CryptType")
        public String cryptType;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>11234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>Seed。</p>
         * 
         * <strong>example:</strong>
         * <p>cbupVnpBjkgjFxfINMHKkrHS-1zZPUm</p>
         */
        @NameInMap("Seed")
        public String seed;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>16537*****831937</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p><a href="https://console.aliyun.com/">https://console.aliyun.com/</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListCallbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallbackResponseBodyData self = new ListCallbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallbackResponseBodyData setCryptType(String cryptType) {
            this.cryptType = cryptType;
            return this;
        }
        public String getCryptType() {
            return this.cryptType;
        }

        public ListCallbackResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCallbackResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCallbackResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCallbackResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCallbackResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListCallbackResponseBodyData setSeed(String seed) {
            this.seed = seed;
            return this;
        }
        public String getSeed() {
            return this.seed;
        }

        public ListCallbackResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListCallbackResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
