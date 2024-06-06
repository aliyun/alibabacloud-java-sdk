// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetPcrInfoResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public GetPcrInfoResponseBodyData data;

    /**
     * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPcrInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPcrInfoResponseBody self = new GetPcrInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPcrInfoResponseBody setData(GetPcrInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPcrInfoResponseBodyData getData() {
        return this.data;
    }

    public GetPcrInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPcrInfoResponseBodyData extends TeaModel {
        /**
         * <p>The timestamp when the report was created. The timestamp is in milliseconds.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Report name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Download url link.</p>
         */
        @NameInMap("url")
        public String url;

        public static GetPcrInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPcrInfoResponseBodyData self = new GetPcrInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPcrInfoResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPcrInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPcrInfoResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
