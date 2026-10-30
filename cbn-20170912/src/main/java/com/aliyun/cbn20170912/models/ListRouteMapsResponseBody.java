// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListRouteMapsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
     * <li>If <strong>NextToken</strong> returns a value, the value is the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B2063B16-852B-5B66-B73D-4ED4D1A5E5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the route maps.</p>
     */
    @NameInMap("RouteMaps")
    public java.util.List<ListRouteMapsResponseBodyRouteMaps> routeMaps;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRouteMapsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapsResponseBody self = new ListRouteMapsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteMapsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteMapsResponseBody setRouteMaps(java.util.List<ListRouteMapsResponseBodyRouteMaps> routeMaps) {
        this.routeMaps = routeMaps;
        return this;
    }
    public java.util.List<ListRouteMapsResponseBodyRouteMaps> getRouteMaps() {
        return this.routeMaps;
    }

    public ListRouteMapsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteMapsResponseBodyRouteMapsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>jg</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRouteMapsResponseBodyRouteMapsTag build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapsResponseBodyRouteMapsTag self = new ListRouteMapsResponseBodyRouteMapsTag();
            return TeaModel.build(map, self);
        }

        public ListRouteMapsResponseBodyRouteMapsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRouteMapsResponseBodyRouteMapsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRouteMapsResponseBodyRouteMaps extends TeaModel {
        /**
         * <p>The time when the route map was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-28T02:29:19Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The direction of the route map. Valid values: </p>
         * <ul>
         * <li>Inbound: inbound.</li>
         * <li>Outbound: outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inbound</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The name of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the route map. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmydlzjd6dlhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-y40mxdvf7joc12****</p>
         */
        @NameInMap("RouteMapId")
        public String routeMapId;

        /**
         * <p>The status of the route map. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The route map is being created.</li>
         * <li><strong>Updating</strong>: The route map is being updated.</li>
         * <li><strong>Active</strong>: The route map is available.</li>
         * <li><strong>Deleting</strong>: The route map is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tag")
        public java.util.List<ListRouteMapsResponseBodyRouteMapsTag> tag;

        /**
         * <p>The version number of the route map configuration.
         * The version number increases each time the route map and its associated route map rules are modified.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListRouteMapsResponseBodyRouteMaps build(java.util.Map<String, ?> map) throws Exception {
            ListRouteMapsResponseBodyRouteMaps self = new ListRouteMapsResponseBodyRouteMaps();
            return TeaModel.build(map, self);
        }

        public ListRouteMapsResponseBodyRouteMaps setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListRouteMapsResponseBodyRouteMaps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRouteMapsResponseBodyRouteMaps setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListRouteMapsResponseBodyRouteMaps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRouteMapsResponseBodyRouteMaps setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListRouteMapsResponseBodyRouteMaps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRouteMapsResponseBodyRouteMaps setRouteMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public ListRouteMapsResponseBodyRouteMaps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRouteMapsResponseBodyRouteMaps setTag(java.util.List<ListRouteMapsResponseBodyRouteMapsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListRouteMapsResponseBodyRouteMapsTag> getTag() {
            return this.tag;
        }

        public ListRouteMapsResponseBodyRouteMaps setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
