// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUrlObservationsResponseBody extends TeaModel {
    @NameInMap("Configs")
    public java.util.List<ListUrlObservationsResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListUrlObservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUrlObservationsResponseBody self = new ListUrlObservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUrlObservationsResponseBody setConfigs(java.util.List<ListUrlObservationsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListUrlObservationsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListUrlObservationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUrlObservationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUrlObservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUrlObservationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUrlObservationsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListUrlObservationsResponseBodyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>35281609698****</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("SdkType")
        public String sdkType;

        /**
         * <strong>example:</strong>
         * <p>example.com/test</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListUrlObservationsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListUrlObservationsResponseBodyConfigs self = new ListUrlObservationsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListUrlObservationsResponseBodyConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public ListUrlObservationsResponseBodyConfigs setSdkType(String sdkType) {
            this.sdkType = sdkType;
            return this;
        }
        public String getSdkType() {
            return this.sdkType;
        }

        public ListUrlObservationsResponseBodyConfigs setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
