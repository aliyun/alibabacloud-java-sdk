// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("DestinationId")
        public Long destinationId;

        /**
         * <p>Indicates whether the data destination is configured to receive error operation data. Error operation data is the data that failed to be forwarded for two consecutive times.</p>
         * <ul>
         * <li><strong>true</strong>: The data destination is configured to receive error operation data.</li>
         * <li><strong>false</strong>: The data destination is configured to receive regular data instead of error operation data.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsFailover")
        public Boolean isFailover;

        /**
         * <p>The name of the data destination.</p>
         * 
         * <strong>example:</strong>
         * <p>DataPurpose</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The action of forwarding data to the data destination.</p>
         * 
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the data destination was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss.SSS\\&quot;Z\\&quot;</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
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
