// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAutoResourceOptimizeRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAutoResourceOptimizeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeRulesResponseBody self = new GetAutoResourceOptimizeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAutoResourceOptimizeRulesResponseBody setData(GetAutoResourceOptimizeRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoResourceOptimizeRulesResponseBodyData getData() {
        return this.data;
    }

    public GetAutoResourceOptimizeRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoResourceOptimizeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoResourceOptimizeRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList extends TeaModel {
        @NameInMap("AutoDefragment")
        public Boolean autoDefragment;

        @NameInMap("DasProOn")
        public Boolean dasProOn;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TableFragmentationRatio")
        public Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        public Double tableSpaceSize;

        @NameInMap("UserId")
        public String userId;

        public static GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList self = new GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList();
            return TeaModel.build(map, self);
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setAutoDefragment(Boolean autoDefragment) {
            this.autoDefragment = autoDefragment;
            return this;
        }
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setDasProOn(Boolean dasProOn) {
            this.dasProOn = dasProOn;
            return this;
        }
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setTableFragmentationRatio(Double tableFragmentationRatio) {
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setTableSpaceSize(Double tableSpaceSize) {
            this.tableSpaceSize = tableSpaceSize;
            return this;
        }
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList extends TeaModel {
        @NameInMap("AutoDefragment")
        public Boolean autoDefragment;

        @NameInMap("DasProOn")
        public Boolean dasProOn;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TableFragmentationRatio")
        public Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        public Double tableSpaceSize;

        @NameInMap("UserId")
        public String userId;

        public static GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList self = new GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList();
            return TeaModel.build(map, self);
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setAutoDefragment(Boolean autoDefragment) {
            this.autoDefragment = autoDefragment;
            return this;
        }
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setDasProOn(Boolean dasProOn) {
            this.dasProOn = dasProOn;
            return this;
        }
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setTableFragmentationRatio(Double tableFragmentationRatio) {
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setTableSpaceSize(Double tableSpaceSize) {
            this.tableSpaceSize = tableSpaceSize;
            return this;
        }
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList extends TeaModel {
        @NameInMap("AutoDefragment")
        public Boolean autoDefragment;

        @NameInMap("DasProOn")
        public Boolean dasProOn;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TableFragmentationRatio")
        public Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        public Double tableSpaceSize;

        @NameInMap("UserId")
        public String userId;

        public static GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList self = new GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList();
            return TeaModel.build(map, self);
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setAutoDefragment(Boolean autoDefragment) {
            this.autoDefragment = autoDefragment;
            return this;
        }
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setDasProOn(Boolean dasProOn) {
            this.dasProOn = dasProOn;
            return this;
        }
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setTableFragmentationRatio(Double tableFragmentationRatio) {
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setTableSpaceSize(Double tableSpaceSize) {
            this.tableSpaceSize = tableSpaceSize;
            return this;
        }
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        public GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAutoResourceOptimizeRulesResponseBodyData extends TeaModel {
        @NameInMap("EnableAutoResourceOptimizeCount")
        public Long enableAutoResourceOptimizeCount;

        @NameInMap("EnableAutoResourceOptimizeList")
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList> enableAutoResourceOptimizeList;

        @NameInMap("HasEnableRuleButNotDasProCount")
        public Long hasEnableRuleButNotDasProCount;

        @NameInMap("HasEnableRuleButNotDasProList")
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList;

        @NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceCount")
        public Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount;

        @NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceIdList")
        public java.util.List<String> neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;

        @NameInMap("TotalAutoResourceOptimizeRulesCount")
        public Long totalAutoResourceOptimizeRulesCount;

        @NameInMap("TurnOffAutoResourceOptimizeCount")
        public Long turnOffAutoResourceOptimizeCount;

        @NameInMap("TurnOffAutoResourceOptimizeList")
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList> turnOffAutoResourceOptimizeList;

        public static GetAutoResourceOptimizeRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoResourceOptimizeRulesResponseBodyData self = new GetAutoResourceOptimizeRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setEnableAutoResourceOptimizeCount(Long enableAutoResourceOptimizeCount) {
            this.enableAutoResourceOptimizeCount = enableAutoResourceOptimizeCount;
            return this;
        }
        public Long getEnableAutoResourceOptimizeCount() {
            return this.enableAutoResourceOptimizeCount;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setEnableAutoResourceOptimizeList(java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList> enableAutoResourceOptimizeList) {
            this.enableAutoResourceOptimizeList = enableAutoResourceOptimizeList;
            return this;
        }
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataEnableAutoResourceOptimizeList> getEnableAutoResourceOptimizeList() {
            return this.enableAutoResourceOptimizeList;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setHasEnableRuleButNotDasProCount(Long hasEnableRuleButNotDasProCount) {
            this.hasEnableRuleButNotDasProCount = hasEnableRuleButNotDasProCount;
            return this;
        }
        public Long getHasEnableRuleButNotDasProCount() {
            return this.hasEnableRuleButNotDasProCount;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setHasEnableRuleButNotDasProList(java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList) {
            this.hasEnableRuleButNotDasProList = hasEnableRuleButNotDasProList;
            return this;
        }
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataHasEnableRuleButNotDasProList> getHasEnableRuleButNotDasProList() {
            return this.hasEnableRuleButNotDasProList;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setNeverEnableAutoResourceOptimizeOrReleasedInstanceCount(Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount) {
            this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount = neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
            return this;
        }
        public Long getNeverEnableAutoResourceOptimizeOrReleasedInstanceCount() {
            return this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList(java.util.List<String> neverEnableAutoResourceOptimizeOrReleasedInstanceIdList) {
            this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
            return this;
        }
        public java.util.List<String> getNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList() {
            return this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setTotalAutoResourceOptimizeRulesCount(Long totalAutoResourceOptimizeRulesCount) {
            this.totalAutoResourceOptimizeRulesCount = totalAutoResourceOptimizeRulesCount;
            return this;
        }
        public Long getTotalAutoResourceOptimizeRulesCount() {
            return this.totalAutoResourceOptimizeRulesCount;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setTurnOffAutoResourceOptimizeCount(Long turnOffAutoResourceOptimizeCount) {
            this.turnOffAutoResourceOptimizeCount = turnOffAutoResourceOptimizeCount;
            return this;
        }
        public Long getTurnOffAutoResourceOptimizeCount() {
            return this.turnOffAutoResourceOptimizeCount;
        }

        public GetAutoResourceOptimizeRulesResponseBodyData setTurnOffAutoResourceOptimizeList(java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList> turnOffAutoResourceOptimizeList) {
            this.turnOffAutoResourceOptimizeList = turnOffAutoResourceOptimizeList;
            return this;
        }
        public java.util.List<GetAutoResourceOptimizeRulesResponseBodyDataTurnOffAutoResourceOptimizeList> getTurnOffAutoResourceOptimizeList() {
            return this.turnOffAutoResourceOptimizeList;
        }

    }

}
