// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDocumentsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>schema id</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    @NameInMap("SearchPattern")
    public String searchPattern;

    @NameInMap("Sorts")
    public java.util.List<ListDocumentsRequestSorts> sorts;

    public static ListDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsRequest self = new ListDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDocumentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDocumentsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDocumentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDocumentsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentsRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public ListDocumentsRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListDocumentsRequest setSorts(java.util.List<ListDocumentsRequestSorts> sorts) {
        this.sorts = sorts;
        return this;
    }
    public java.util.List<ListDocumentsRequestSorts> getSorts() {
        return this.sorts;
    }

    public static class ListDocumentsRequestSorts extends TeaModel {
        @NameInMap("Order")
        public String order;

        @NameInMap("PropertyName")
        public String propertyName;

        public static ListDocumentsRequestSorts build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsRequestSorts self = new ListDocumentsRequestSorts();
            return TeaModel.build(map, self);
        }

        public ListDocumentsRequestSorts setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public ListDocumentsRequestSorts setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

    }

}
