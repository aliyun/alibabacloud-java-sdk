// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RearrangeDbToInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RearrangeDbToInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RearrangeDbToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RearrangeDbToInstanceResponseBody self = new RearrangeDbToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RearrangeDbToInstanceResponseBody setData(RearrangeDbToInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RearrangeDbToInstanceResponseBodyData getData() {
        return this.data;
    }

    public RearrangeDbToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RearrangeDbToInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RearrangeDbToInstanceResponseBodyDataData extends TeaModel {
        @NameInMap("DstInstance")
        public String dstInstance;

        @NameInMap("SrcDbName")
        public String srcDbName;

        @NameInMap("SrcInstance")
        public String srcInstance;

        public static RearrangeDbToInstanceResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            RearrangeDbToInstanceResponseBodyDataData self = new RearrangeDbToInstanceResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public RearrangeDbToInstanceResponseBodyDataData setDstInstance(String dstInstance) {
            this.dstInstance = dstInstance;
            return this;
        }
        public String getDstInstance() {
            return this.dstInstance;
        }

        public RearrangeDbToInstanceResponseBodyDataData setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public RearrangeDbToInstanceResponseBodyDataData setSrcInstance(String srcInstance) {
            this.srcInstance = srcInstance;
            return this;
        }
        public String getSrcInstance() {
            return this.srcInstance;
        }

    }

    public static class RearrangeDbToInstanceResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<RearrangeDbToInstanceResponseBodyDataData> data;

        public static RearrangeDbToInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RearrangeDbToInstanceResponseBodyData self = new RearrangeDbToInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RearrangeDbToInstanceResponseBodyData setData(java.util.List<RearrangeDbToInstanceResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<RearrangeDbToInstanceResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
