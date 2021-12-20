// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceEntriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceEntries")
    public java.util.List<ListServiceEntriesResponseBodyServiceEntries> serviceEntries;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEntriesResponseBody self = new ListServiceEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceEntriesResponseBody setServiceEntries(java.util.List<ListServiceEntriesResponseBodyServiceEntries> serviceEntries) {
        this.serviceEntries = serviceEntries;
        return this;
    }
    public java.util.List<ListServiceEntriesResponseBodyServiceEntries> getServiceEntries() {
        return this.serviceEntries;
    }

    public ListServiceEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceEntriesResponseBodyServiceEntries extends TeaModel {
        @NameInMap("ServiceEntryDescription")
        public String serviceEntryDescription;

        @NameInMap("ServiceEntryId")
        public String serviceEntryId;

        @NameInMap("ServiceEntryName")
        public String serviceEntryName;

        @NameInMap("ServiceEntryStatus")
        public String serviceEntryStatus;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        public static ListServiceEntriesResponseBodyServiceEntries build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEntriesResponseBodyServiceEntries self = new ListServiceEntriesResponseBodyServiceEntries();
            return TeaModel.build(map, self);
        }

        public ListServiceEntriesResponseBodyServiceEntries setServiceEntryDescription(String serviceEntryDescription) {
            this.serviceEntryDescription = serviceEntryDescription;
            return this;
        }
        public String getServiceEntryDescription() {
            return this.serviceEntryDescription;
        }

        public ListServiceEntriesResponseBodyServiceEntries setServiceEntryId(String serviceEntryId) {
            this.serviceEntryId = serviceEntryId;
            return this;
        }
        public String getServiceEntryId() {
            return this.serviceEntryId;
        }

        public ListServiceEntriesResponseBodyServiceEntries setServiceEntryName(String serviceEntryName) {
            this.serviceEntryName = serviceEntryName;
            return this;
        }
        public String getServiceEntryName() {
            return this.serviceEntryName;
        }

        public ListServiceEntriesResponseBodyServiceEntries setServiceEntryStatus(String serviceEntryStatus) {
            this.serviceEntryStatus = serviceEntryStatus;
            return this;
        }
        public String getServiceEntryStatus() {
            return this.serviceEntryStatus;
        }

        public ListServiceEntriesResponseBodyServiceEntries setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceEntriesResponseBodyServiceEntries setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListServiceEntriesResponseBodyServiceEntries setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
