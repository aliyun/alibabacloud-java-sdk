// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestCasesRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListServiceTestCasesRequestFilters> filters;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-0e6fca6a51a54420****</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static ListServiceTestCasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestCasesRequest self = new ListServiceTestCasesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceTestCasesRequest setFilters(java.util.List<ListServiceTestCasesRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListServiceTestCasesRequestFilters> getFilters() {
        return this.filters;
    }

    public ListServiceTestCasesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestCasesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestCasesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceTestCasesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListServiceTestCasesRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static class ListServiceTestCasesRequestFilters extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more filters. Valid values:</p>
         * <p><strong>Status</strong></p>
         * <p><strong>TaskId</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceTestCasesRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListServiceTestCasesRequestFilters self = new ListServiceTestCasesRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListServiceTestCasesRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceTestCasesRequestFilters setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
