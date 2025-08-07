// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListBackupsRequest extends TeaModel {
    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListBackupsRequestFilter> filter;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYoaeZA6xVdkCrmG9EmGshtmECUGpq9Qm7x5vQkpz9NXH0XzUc9t4Kxaf3UtuPY4a0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListBackupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsRequest self = new ListBackupsRequest();
        return TeaModel.build(map, self);
    }

    public ListBackupsRequest setFilter(java.util.List<ListBackupsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListBackupsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListBackupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBackupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListBackupsRequestFilter extends TeaModel {
        /**
         * <p>The parameter name of the filter. You can specify one or more parameter names to query services. Valid values:</p>
         * <ul>
         * <li>BackupId: the ID of the backup.</li>
         * <li>ServiceInstanceId: The ID of the service instance.</li>
         * <li>Status: the state of the service.</li>
         * <li>StartTime</li>
         * <li>EndTime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceInstanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of filters.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListBackupsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListBackupsRequestFilter self = new ListBackupsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListBackupsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBackupsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
