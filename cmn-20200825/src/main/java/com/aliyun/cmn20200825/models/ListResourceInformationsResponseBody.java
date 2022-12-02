// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceInformationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceInformation")
    public java.util.List<ListResourceInformationsResponseBodyResourceInformation> resourceInformation;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResourceInformationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInformationsResponseBody self = new ListResourceInformationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceInformationsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListResourceInformationsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListResourceInformationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceInformationsResponseBody setResourceInformation(java.util.List<ListResourceInformationsResponseBodyResourceInformation> resourceInformation) {
        this.resourceInformation = resourceInformation;
        return this;
    }
    public java.util.List<ListResourceInformationsResponseBodyResourceInformation> getResourceInformation() {
        return this.resourceInformation;
    }

    public ListResourceInformationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceInformationsResponseBodyResourceInformationInformation extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyAction")
        public String keyAction;

        @NameInMap("KeyAttribute")
        public String keyAttribute;

        @NameInMap("KeyDescription")
        public String keyDescription;

        public static ListResourceInformationsResponseBodyResourceInformationInformation build(java.util.Map<String, ?> map) throws Exception {
            ListResourceInformationsResponseBodyResourceInformationInformation self = new ListResourceInformationsResponseBodyResourceInformationInformation();
            return TeaModel.build(map, self);
        }

        public ListResourceInformationsResponseBodyResourceInformationInformation setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceInformationsResponseBodyResourceInformationInformation setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public ListResourceInformationsResponseBodyResourceInformationInformation setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        public ListResourceInformationsResponseBodyResourceInformationInformation setKeyDescription(String keyDescription) {
            this.keyDescription = keyDescription;
            return this;
        }
        public String getKeyDescription() {
            return this.keyDescription;
        }

    }

    public static class ListResourceInformationsResponseBodyResourceInformation extends TeaModel {
        @NameInMap("Information")
        public java.util.List<ListResourceInformationsResponseBodyResourceInformationInformation> information;

        @NameInMap("ResourceAttribute")
        public String resourceAttribute;

        @NameInMap("ResourceInformationId")
        public String resourceInformationId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceInformationsResponseBodyResourceInformation build(java.util.Map<String, ?> map) throws Exception {
            ListResourceInformationsResponseBodyResourceInformation self = new ListResourceInformationsResponseBodyResourceInformation();
            return TeaModel.build(map, self);
        }

        public ListResourceInformationsResponseBodyResourceInformation setInformation(java.util.List<ListResourceInformationsResponseBodyResourceInformationInformation> information) {
            this.information = information;
            return this;
        }
        public java.util.List<ListResourceInformationsResponseBodyResourceInformationInformation> getInformation() {
            return this.information;
        }

        public ListResourceInformationsResponseBodyResourceInformation setResourceAttribute(String resourceAttribute) {
            this.resourceAttribute = resourceAttribute;
            return this;
        }
        public String getResourceAttribute() {
            return this.resourceAttribute;
        }

        public ListResourceInformationsResponseBodyResourceInformation setResourceInformationId(String resourceInformationId) {
            this.resourceInformationId = resourceInformationId;
            return this;
        }
        public String getResourceInformationId() {
            return this.resourceInformationId;
        }

        public ListResourceInformationsResponseBodyResourceInformation setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
