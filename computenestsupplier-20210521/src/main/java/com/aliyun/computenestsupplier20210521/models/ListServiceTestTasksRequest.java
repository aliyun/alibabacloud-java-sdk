// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceTestTasksRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceTestTasksRequestFilter> filter;

    /**
     * <p>Number of items per page in a paginated query. The maximum is 100, and the default is 20.</p>
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
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
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
     * <p>service-062ae8e13b394dd5b63c</p>
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

    public static ListServiceTestTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTestTasksRequest self = new ListServiceTestTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceTestTasksRequest setFilter(java.util.List<ListServiceTestTasksRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceTestTasksRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceTestTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTestTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTestTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceTestTasksRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ListServiceTestTasksRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static class ListServiceTestTasksRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>Status: the status of the task.</li>
         * <li>TaskId: the task id.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value N of the filter. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceTestTasksRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceTestTasksRequestFilter self = new ListServiceTestTasksRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceTestTasksRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceTestTasksRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
