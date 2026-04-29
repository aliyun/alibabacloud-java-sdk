// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListAgentGroupResponseBodyData data;

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

    public static CloudListAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListAgentGroupResponseBody self = new CloudListAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListAgentGroupResponseBody setData(CloudListAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudListAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup extends TeaModel {
        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>comment1</p>
         */
        @NameInMap("Comment")
        public String comment;

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
         * <p>外呼组编号</p>
         * 
         * <strong>example:</strong>
         * <p>ZO874912</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>外呼组名称</p>
         * 
         * <strong>example:</strong>
         * <p>gpname1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>外呼组类型 1：外呼总组 2：外呼组</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup build(java.util.Map<String, ?> map) throws Exception {
            CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup self = new CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup();
            return TeaModel.build(map, self);
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class CloudListAgentGroupResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ChildGnos")
        public String childGnos;

        @NameInMap("CtiLinkAgentGroup")
        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup ctiLinkAgentGroup;

        public static CloudListAgentGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListAgentGroupResponseBodyDataList self = new CloudListAgentGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListAgentGroupResponseBodyDataList setChildGnos(String childGnos) {
            this.childGnos = childGnos;
            return this;
        }
        public String getChildGnos() {
            return this.childGnos;
        }

        public CloudListAgentGroupResponseBodyDataList setCtiLinkAgentGroup(CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup ctiLinkAgentGroup) {
            this.ctiLinkAgentGroup = ctiLinkAgentGroup;
            return this;
        }
        public CloudListAgentGroupResponseBodyDataListCtiLinkAgentGroup getCtiLinkAgentGroup() {
            return this.ctiLinkAgentGroup;
        }

    }

    public static class CloudListAgentGroupResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CloudListAgentGroupResponseBodyDataList> list;

        public static CloudListAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListAgentGroupResponseBodyData self = new CloudListAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListAgentGroupResponseBodyData setList(java.util.List<CloudListAgentGroupResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListAgentGroupResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
