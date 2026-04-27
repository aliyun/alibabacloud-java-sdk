// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAgentTelResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListAgentTelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListAgentTelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListAgentTelResponseBody self = new CloudListAgentTelResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListAgentTelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListAgentTelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListAgentTelResponseBody setData(CloudListAgentTelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListAgentTelResponseBodyData getData() {
        return this.data;
    }

    public CloudListAgentTelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListAgentTelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListAgentTelResponseBodyDataList extends TeaModel {
        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>7098</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7122600</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>座席电话id</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>是否绑定，0:未绑定 1:绑定</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsBind")
        public Long isBind;

        /**
         * <p>是否验证，0:未验证 1:已验证</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsValidity")
        public Long isValidity;

        /**
         * <p>电话号码</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        @NameInMap("Tel")
        public String tel;

        /**
         * <p>电话类型，1:固话 2:手机 3:分机 4:软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TelType")
        public Long telType;

        public static CloudListAgentTelResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListAgentTelResponseBodyDataList self = new CloudListAgentTelResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListAgentTelResponseBodyDataList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public CloudListAgentTelResponseBodyDataList setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudListAgentTelResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudListAgentTelResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListAgentTelResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListAgentTelResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudListAgentTelResponseBodyDataList setIsBind(Long isBind) {
            this.isBind = isBind;
            return this;
        }
        public Long getIsBind() {
            return this.isBind;
        }

        public CloudListAgentTelResponseBodyDataList setIsValidity(Long isValidity) {
            this.isValidity = isValidity;
            return this;
        }
        public Long getIsValidity() {
            return this.isValidity;
        }

        public CloudListAgentTelResponseBodyDataList setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

        public CloudListAgentTelResponseBodyDataList setTelType(Long telType) {
            this.telType = telType;
            return this;
        }
        public Long getTelType() {
            return this.telType;
        }

    }

    public static class CloudListAgentTelResponseBodyData extends TeaModel {
        /**
         * <p>座席电话数组</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListAgentTelResponseBodyDataList> list;

        public static CloudListAgentTelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListAgentTelResponseBodyData self = new CloudListAgentTelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListAgentTelResponseBodyData setList(java.util.List<CloudListAgentTelResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListAgentTelResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
