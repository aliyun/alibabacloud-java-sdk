// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingModelVersionResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public ListThingModelVersionResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListThingModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListThingModelVersionResponseBody self = new ListThingModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListThingModelVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingModelVersionResponseBody setData(ListThingModelVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListThingModelVersionResponseBodyData getData() {
        return this.data;
    }

    public ListThingModelVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingModelVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListThingModelVersionResponseBodyDataModelVersions extends TeaModel {
        /**
         * <p>The description of the TSL model version.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the TSL model version was published. The time is displayed in UTC. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The version number of the TSL model.</p>
         */
        @NameInMap("ModelVersion")
        public String modelVersion;

        public static ListThingModelVersionResponseBodyDataModelVersions build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseBodyDataModelVersions self = new ListThingModelVersionResponseBodyDataModelVersions();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseBodyDataModelVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListThingModelVersionResponseBodyDataModelVersions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListThingModelVersionResponseBodyDataModelVersions setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public String getModelVersion() {
            return this.modelVersion;
        }

    }

    public static class ListThingModelVersionResponseBodyData extends TeaModel {
        /**
         * <p>The list of TSL model versions. The versions are displayed in descending order based on the release time. The first version is the current version.</p>
         */
        @NameInMap("ModelVersions")
        public java.util.List<ListThingModelVersionResponseBodyDataModelVersions> modelVersions;

        public static ListThingModelVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseBodyData self = new ListThingModelVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseBodyData setModelVersions(java.util.List<ListThingModelVersionResponseBodyDataModelVersions> modelVersions) {
            this.modelVersions = modelVersions;
            return this;
        }
        public java.util.List<ListThingModelVersionResponseBodyDataModelVersions> getModelVersions() {
            return this.modelVersions;
        }

    }

}
