// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Destinations")
    public ListDestinationResponseBodyDestinations destinations;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestinationId")
        public Long destinationId;

        @NameInMap("IsFailover")
        public Boolean isFailover;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

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
