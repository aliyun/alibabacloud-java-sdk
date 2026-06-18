// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailResponseBody extends TeaModel {
    /**
     * <p>The status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Quality inspection job information.</p>
     */
    @NameInMap("Data")
    public GetQualityProjectDetailResponseBodyData data;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetQualityProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectDetailResponseBody self = new GetQualityProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityProjectDetailResponseBody setData(GetQualityProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public GetQualityProjectDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityProjectDetailResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQualityProjectDetailResponseBodyData extends TeaModel {
        /**
         * <p>Inspection frequency type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Periodic quality inspection</li>
         * <li><strong>4</strong>: Ad hoc quality inspection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckFreqType")
        public Integer checkFreqType;

        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-07 18:07:18</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Quality inspection sampling scope.</p>
         */
        @NameInMap("DepList")
        public java.util.List<Long> depList;

        /**
         * <p>Quality inspection sampling scope.</p>
         */
        @NameInMap("GroupList")
        public java.util.List<Long> groupList;

        /**
         * <p>Quality inspection job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15977801</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Updated At.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-07 18:07:19</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>Quality inspection job name</p>
         * 
         * <strong>example:</strong>
         * <p>自动化质检任务</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Quality inspection rule IDs.</p>
         */
        @NameInMap("QualityRuleIds")
        public java.util.List<Long> qualityRuleIds;

        /**
         * <p>Quality inspection type. Fixed value: <strong>1</strong> (Consultation).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QualityType")
        public Integer qualityType;

        /**
         * <p>Quality inspection sampling scope.</p>
         */
        @NameInMap("ServicerList")
        public java.util.List<Long> servicerList;

        /**
         * <p>Quality inspection job status. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Start  </li>
         * <li><strong>1</strong>: Shutdown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Quality inspection job version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetQualityProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityProjectDetailResponseBodyData self = new GetQualityProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityProjectDetailResponseBodyData setCheckFreqType(Integer checkFreqType) {
            this.checkFreqType = checkFreqType;
            return this;
        }
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        public GetQualityProjectDetailResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityProjectDetailResponseBodyData setDepList(java.util.List<Long> depList) {
            this.depList = depList;
            return this;
        }
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        public GetQualityProjectDetailResponseBodyData setGroupList(java.util.List<Long> groupList) {
            this.groupList = groupList;
            return this;
        }
        public java.util.List<Long> getGroupList() {
            return this.groupList;
        }

        public GetQualityProjectDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityProjectDetailResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityProjectDetailResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityProjectDetailResponseBodyData setQualityRuleIds(java.util.List<Long> qualityRuleIds) {
            this.qualityRuleIds = qualityRuleIds;
            return this;
        }
        public java.util.List<Long> getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        public GetQualityProjectDetailResponseBodyData setQualityType(Integer qualityType) {
            this.qualityType = qualityType;
            return this;
        }
        public Integer getQualityType() {
            return this.qualityType;
        }

        public GetQualityProjectDetailResponseBodyData setServicerList(java.util.List<Long> servicerList) {
            this.servicerList = servicerList;
            return this;
        }
        public java.util.List<Long> getServicerList() {
            return this.servicerList;
        }

        public GetQualityProjectDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityProjectDetailResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
