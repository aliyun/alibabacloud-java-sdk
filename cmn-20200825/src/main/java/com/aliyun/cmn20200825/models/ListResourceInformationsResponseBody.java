// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceInformationsResponseBody extends TeaModel {
    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 数组，返回示例目录。
    @NameInMap("ResourceInformation")
    public java.util.List<ListResourceInformationsResponseBodyResourceInformation> resourceInformation;

    // 总记录数。
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
        // 键
        @NameInMap("Key")
        public String key;

        // 键动作
        @NameInMap("KeyAction")
        public String keyAction;

        // 键属性
        @NameInMap("KeyAttribute")
        public String keyAttribute;

        // 键描述
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
        // 信息
        @NameInMap("Information")
        public java.util.List<ListResourceInformationsResponseBodyResourceInformationInformation> information;

        // 资源属性
        @NameInMap("ResourceAttribute")
        public String resourceAttribute;

        // 资源一级ID
        @NameInMap("ResourceInformationId")
        public String resourceInformationId;

        // 资源类型
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
