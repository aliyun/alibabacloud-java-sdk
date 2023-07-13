// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data destinations.</p>
     */
    @NameInMap("Destinations")
    public ListDestinationResponseBodyDestinations destinations;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDestinationResponseBody self = new ListDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDestinationResponseBody setDestinations(ListDestinationResponseBodyDestinations destinations) {
        this.destinations = destinations;
        return this;
    }
    public ListDestinationResponseBodyDestinations getDestinations() {
        return this.destinations;
    }

    public ListDestinationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDestinationResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDestinationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDestinationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDestinationResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDestinationResponseBodyDestinationsDestinations extends TeaModel {
        /**
         * <p>The configuration data of the data destination.</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The description of the data destination.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the data destination.</p>
         */
        @NameInMap("DestinationId")
        public Long destinationId;

        /**
         * <p>Indicates whether the data destination is configured to receive error operation data. Error operation data is the data that failed to be forwarded for two consecutive times.</p>
         * <br>
         * <p>*   **true**: The data destination is configured to receive error operation data.</p>
         * <p>*   **false**: The data destination is configured to receive regular data instead of error operation data.</p>
         * <br>
         * <p>Default value: **false**.</p>
         */
        @NameInMap("IsFailover")
        public Boolean isFailover;

        /**
         * <p>The name of the data destination.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The action of forwarding data to the data destination.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the data destination was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the `yyyy-MM-dd\"T\"HH:mm:ss.SSS\"Z\"` format.</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        public static ListDestinationResponseBodyDestinationsDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListDestinationResponseBodyDestinationsDestinations self = new ListDestinationResponseBodyDestinationsDestinations();
            return TeaModel.build(map, self);
        }

        public ListDestinationResponseBodyDestinationsDestinations setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListDestinationResponseBodyDestinationsDestinations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDestinationResponseBodyDestinationsDestinations setDestinationId(Long destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public Long getDestinationId() {
            return this.destinationId;
        }

        public ListDestinationResponseBodyDestinationsDestinations setIsFailover(Boolean isFailover) {
            this.isFailover = isFailover;
            return this;
        }
        public Boolean getIsFailover() {
            return this.isFailover;
        }

        public ListDestinationResponseBodyDestinationsDestinations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDestinationResponseBodyDestinationsDestinations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDestinationResponseBodyDestinationsDestinations setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDestinationResponseBodyDestinationsDestinations setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

    public static class ListDestinationResponseBodyDestinations extends TeaModel {
        @NameInMap("destinations")
        public java.util.List<ListDestinationResponseBodyDestinationsDestinations> destinations;

        public static ListDestinationResponseBodyDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListDestinationResponseBodyDestinations self = new ListDestinationResponseBodyDestinations();
            return TeaModel.build(map, self);
        }

        public ListDestinationResponseBodyDestinations setDestinations(java.util.List<ListDestinationResponseBodyDestinationsDestinations> destinations) {
            this.destinations = destinations;
            return this;
        }
        public java.util.List<ListDestinationResponseBodyDestinationsDestinations> getDestinations() {
            return this.destinations;
        }

    }

}
