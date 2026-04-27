// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListFreeAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListFreeAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListFreeAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListFreeAgentResponseBody self = new CloudListFreeAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListFreeAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListFreeAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListFreeAgentResponseBody setData(CloudListFreeAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListFreeAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudListFreeAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListFreeAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListFreeAgentResponseBodyDataList extends TeaModel {
        /**
         * <p>座席编号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>座席名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        public static CloudListFreeAgentResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListFreeAgentResponseBodyDataList self = new CloudListFreeAgentResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListFreeAgentResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudListFreeAgentResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CloudListFreeAgentResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CloudListFreeAgentResponseBodyDataList> list;

        public static CloudListFreeAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListFreeAgentResponseBodyData self = new CloudListFreeAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListFreeAgentResponseBodyData setList(java.util.List<CloudListFreeAgentResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListFreeAgentResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
