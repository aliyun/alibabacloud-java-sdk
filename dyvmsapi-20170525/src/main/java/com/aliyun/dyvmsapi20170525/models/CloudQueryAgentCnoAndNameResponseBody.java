// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentCnoAndNameResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryAgentCnoAndNameResponseBodyData data;

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

    public static CloudQueryAgentCnoAndNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentCnoAndNameResponseBody self = new CloudQueryAgentCnoAndNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentCnoAndNameResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryAgentCnoAndNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryAgentCnoAndNameResponseBody setData(CloudQueryAgentCnoAndNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryAgentCnoAndNameResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryAgentCnoAndNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryAgentCnoAndNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryAgentCnoAndNameResponseBodyDataList extends TeaModel {
        /**
         * <p>坐席工号</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        public static CloudQueryAgentCnoAndNameResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentCnoAndNameResponseBodyDataList self = new CloudQueryAgentCnoAndNameResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentCnoAndNameResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryAgentCnoAndNameResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CloudQueryAgentCnoAndNameResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CloudQueryAgentCnoAndNameResponseBodyDataList> list;

        public static CloudQueryAgentCnoAndNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentCnoAndNameResponseBodyData self = new CloudQueryAgentCnoAndNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentCnoAndNameResponseBodyData setList(java.util.List<CloudQueryAgentCnoAndNameResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryAgentCnoAndNameResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
