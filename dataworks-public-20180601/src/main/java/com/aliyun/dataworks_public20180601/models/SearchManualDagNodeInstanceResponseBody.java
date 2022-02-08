// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SearchManualDagNodeInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchManualDagNodeInstanceResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchManualDagNodeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchManualDagNodeInstanceResponseBody self = new SearchManualDagNodeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchManualDagNodeInstanceResponseBody setData(SearchManualDagNodeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchManualDagNodeInstanceResponseBodyData getData() {
        return this.data;
    }

    public SearchManualDagNodeInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SearchManualDagNodeInstanceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public SearchManualDagNodeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchManualDagNodeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo extends TeaModel {
        @NameInMap("BeginRunningTime")
        public String beginRunningTime;

        @NameInMap("BeginWaitResTime")
        public String beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        public String beginWaitTimeTime;

        @NameInMap("Bizdate")
        public String bizdate;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("DagType")
        public Integer dagType;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ParaValue")
        public String paraValue;

        @NameInMap("Status")
        public Integer status;

        public static SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo self = new SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo();
            return TeaModel.build(map, self);
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setBeginRunningTime(String beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public String getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setBeginWaitResTime(String beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public String getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setBeginWaitTimeTime(String beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public String getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setBizdate(String bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public String getBizdate() {
            return this.bizdate;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setDagType(Integer dagType) {
            this.dagType = dagType;
            return this;
        }
        public Integer getDagType() {
            return this.dagType;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class SearchManualDagNodeInstanceResponseBodyData extends TeaModel {
        @NameInMap("NodeInsInfo")
        public java.util.List<SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo> nodeInsInfo;

        public static SearchManualDagNodeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchManualDagNodeInstanceResponseBodyData self = new SearchManualDagNodeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchManualDagNodeInstanceResponseBodyData setNodeInsInfo(java.util.List<SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo> nodeInsInfo) {
            this.nodeInsInfo = nodeInsInfo;
            return this;
        }
        public java.util.List<SearchManualDagNodeInstanceResponseBodyDataNodeInsInfo> getNodeInsInfo() {
            return this.nodeInsInfo;
        }

    }

}
