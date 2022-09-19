// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListScenariosResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScenarioList")
    public java.util.List<ListScenariosResponseBodyScenarioList> scenarioList;

    @NameInMap("Success")
    public Boolean success;

    public static ListScenariosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenariosResponseBody self = new ListScenariosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenariosResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListScenariosResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListScenariosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenariosResponseBody setScenarioList(java.util.List<ListScenariosResponseBodyScenarioList> scenarioList) {
        this.scenarioList = scenarioList;
        return this;
    }
    public java.util.List<ListScenariosResponseBodyScenarioList> getScenarioList() {
        return this.scenarioList;
    }

    public ListScenariosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScenariosResponseBodyScenarioList extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ScenarioName")
        public String scenarioName;

        public static ListScenariosResponseBodyScenarioList build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenarioList self = new ListScenariosResponseBodyScenarioList();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenarioList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListScenariosResponseBodyScenarioList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenariosResponseBodyScenarioList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListScenariosResponseBodyScenarioList setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

    }

}
