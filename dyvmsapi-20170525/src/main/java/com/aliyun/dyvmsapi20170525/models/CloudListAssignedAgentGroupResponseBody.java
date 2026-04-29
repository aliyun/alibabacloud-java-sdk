// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAssignedAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListAssignedAgentGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListAssignedAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListAssignedAgentGroupResponseBody self = new CloudListAssignedAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListAssignedAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListAssignedAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListAssignedAgentGroupResponseBody setData(CloudListAssignedAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListAssignedAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudListAssignedAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListAssignedAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListAssignedAgentGroupResponseBodyDataList extends TeaModel {
        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Cname")
        public Long cname;

        /**
         * <p>座席编号</p>
         * 
         * <strong>example:</strong>
         * <p>59517582</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-30 06:12:30</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>呼叫中心编号</p>
         * 
         * <strong>example:</strong>
         * <p>7122600</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>外呼组编号</p>
         * 
         * <strong>example:</strong>
         * <p>ZO874912</p>
         */
        @NameInMap("Gno")
        public String gno;

        public static CloudListAssignedAgentGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListAssignedAgentGroupResponseBodyDataList self = new CloudListAssignedAgentGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListAssignedAgentGroupResponseBodyDataList setCname(Long cname) {
            this.cname = cname;
            return this;
        }
        public Long getCname() {
            return this.cname;
        }

        public CloudListAssignedAgentGroupResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudListAssignedAgentGroupResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListAssignedAgentGroupResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListAssignedAgentGroupResponseBodyDataList setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

    }

    public static class CloudListAssignedAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>返回数据</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListAssignedAgentGroupResponseBodyDataList> list;

        public static CloudListAssignedAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListAssignedAgentGroupResponseBodyData self = new CloudListAssignedAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListAssignedAgentGroupResponseBodyData setList(java.util.List<CloudListAssignedAgentGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListAssignedAgentGroupResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
