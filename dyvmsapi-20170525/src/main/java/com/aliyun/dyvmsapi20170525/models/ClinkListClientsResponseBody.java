// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListClientsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListClientsResponseBodyData data;

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

    public static ClinkListClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListClientsResponseBody self = new ClinkListClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListClientsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListClientsResponseBody setData(ClinkListClientsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListClientsResponseBodyData getData() {
        return this.data;
    }

    public ClinkListClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListClientsResponseBodyDataClients extends TeaModel {
        /**
         * <p>是否激活，0: 否；1: 是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>座席绑定电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>座席crm id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CrmId")
        public String crmId;

        /**
         * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HiddenTel")
        public Long hiddenTel;

        /**
         * <p>座席 Id</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>2222</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席所属队列的队列号数组</p>
         */
        @NameInMap("Qnos")
        public java.util.List<String> qnos;

        /**
         * <p>座席角色，0: 普通座席；1: 班长座席</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Role")
        public Long role;

        /**
         * <p>座席状态，0: 离线；1: 在线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>座席类型，1：全渠道、2：呼叫中心、3：在线客服</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ClinkListClientsResponseBodyDataClients build(java.util.Map<String, ?> map) throws Exception {
            ClinkListClientsResponseBodyDataClients self = new ClinkListClientsResponseBodyDataClients();
            return TeaModel.build(map, self);
        }

        public ClinkListClientsResponseBodyDataClients setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public ClinkListClientsResponseBodyDataClients setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public ClinkListClientsResponseBodyDataClients setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public ClinkListClientsResponseBodyDataClients setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkListClientsResponseBodyDataClients setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ClinkListClientsResponseBodyDataClients setCrmId(String crmId) {
            this.crmId = crmId;
            return this;
        }
        public String getCrmId() {
            return this.crmId;
        }

        public ClinkListClientsResponseBodyDataClients setHiddenTel(Long hiddenTel) {
            this.hiddenTel = hiddenTel;
            return this;
        }
        public Long getHiddenTel() {
            return this.hiddenTel;
        }

        public ClinkListClientsResponseBodyDataClients setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ClinkListClientsResponseBodyDataClients setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkListClientsResponseBodyDataClients setQnos(java.util.List<String> qnos) {
            this.qnos = qnos;
            return this;
        }
        public java.util.List<String> getQnos() {
            return this.qnos;
        }

        public ClinkListClientsResponseBodyDataClients setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ClinkListClientsResponseBodyDataClients setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ClinkListClientsResponseBodyDataClients setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ClinkListClientsResponseBodyDataClients setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ClinkListClientsResponseBodyData extends TeaModel {
        /**
         * <p>座席对象列表</p>
         */
        @NameInMap("Clients")
        public java.util.List<ClinkListClientsResponseBodyDataClients> clients;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListClientsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListClientsResponseBodyData self = new ClinkListClientsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListClientsResponseBodyData setClients(java.util.List<ClinkListClientsResponseBodyDataClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<ClinkListClientsResponseBodyDataClients> getClients() {
            return this.clients;
        }

        public ClinkListClientsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListClientsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListClientsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListClientsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
