// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQualityProjectListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectListResponseBody self = new GetQualityProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectListResponseBody setData(GetQualityProjectListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityProjectListResponseBodyData getData() {
        return this.data;
    }

    public GetQualityProjectListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityProjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectListResponseBodyDataQualityProjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckFreqType")
        public Integer checkFreqType;

        /**
         * <strong>example:</strong>
         * <p>2021-04-07 18:07:18</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DepList")
        public java.util.List<Long> depList;

        @NameInMap("GroupList")
        public java.util.List<Long> groupList;

        /**
         * <strong>example:</strong>
         * <p>15977801</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2021-04-07 18:07:19</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("QualityRuleIds")
        public java.util.List<Long> qualityRuleIds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QualityType")
        public Integer qualityType;

        @NameInMap("ServicerList")
        public java.util.List<Long> servicerList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetQualityProjectListResponseBodyDataQualityProjectList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectListResponseBodyDataQualityProjectList self = new GetQualityProjectListResponseBodyDataQualityProjectList();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setCheckFreqType(Integer checkFreqType) {
            this.checkFreqType = checkFreqType;
            return this;
        }
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setDepList(java.util.List<Long> depList) {
            this.depList = depList;
            return this;
        }
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setGroupList(java.util.List<Long> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<Long> getGroupList() {
            return this.groupList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }
        public java.util.List<Long> getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setQualityType(Integer qualityType) {
            this.qualityType = qualityType;
            return this;
        }
        public Integer getQualityType() {
            return this.qualityType;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setServicerList(java.util.List<Long> servicerList) {
            this.servicerList = servicerList;
            return this;
        }
        public java.util.List<Long> getServicerList() {
            return this.servicerList;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityProjectListResponseBodyDataQualityProjectList setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class GetQualityProjectListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("QualityProjectList")
        public java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> qualityProjectList;

        /**
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQualityProjectListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectListResponseBodyData self = new GetQualityProjectListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQualityProjectListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQualityProjectListResponseBodyData setQualityProjectList(java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> qualityProjectList) {
            this.qualityProjectList = qualityProjectList;
            return this;
        }
        public java.util.List<GetQualityProjectListResponseBodyDataQualityProjectList> getQualityProjectList() {
            return this.qualityProjectList;
        }

        public GetQualityProjectListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
