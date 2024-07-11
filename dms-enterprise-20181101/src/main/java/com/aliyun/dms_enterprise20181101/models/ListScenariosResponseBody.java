// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListScenariosResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the returned business scenarios.</p>
     */
    @NameInMap("ScenarioList")
    public java.util.List<ListScenariosResponseBodyScenarioList> scenarioList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the user who created the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>23***</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>41***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
