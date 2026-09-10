// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourcesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned for the current request. This parameter is returned by the List operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The position where the current call finished reading. An empty value indicates that all data has been read. This parameter is returned by the List operation.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The specified resource. This parameter is returned by the Get operation.</p>
     */
    @NameInMap("resource")
    public GetResourcesResponseBodyResource resource;

    /**
     * <p>A list of resources. This parameter is returned by the List operation.</p>
     */
    @NameInMap("resources")
    public java.util.List<GetResourcesResponseBodyResources> resources;

    /**
     * <p>The total number of entries that match the query conditions. This parameter is returned by the List operation.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static GetResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesResponseBody self = new GetResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourcesResponseBody setResource(GetResourcesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetResourcesResponseBodyResource getResource() {
        return this.resource;
    }

    public GetResourcesResponseBody setResources(java.util.List<GetResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<GetResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public GetResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetResourcesResponseBodyResource extends TeaModel {
        /**
         * <p>The resource properties in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Status&quot;:&quot;Available&quot;,&quot;Description&quot;:&quot;&quot;,&quot;AccountPrivilege&quot;:&quot;RoleReadWrite&quot;,&quot;InstanceId&quot;:&quot;r-2ze8v41uei31lo****&quot;,&quot;RegionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;AccountType&quot;:&quot;Normal&quot;,&quot;TypeInfo&quot;:{},&quot;AccountName&quot;:&quot;cctest&quot;}</p>
         */
        @NameInMap("resourceAttributes")
        public java.util.Map<String, ?> resourceAttributes;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cctest</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        public static GetResourcesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetResourcesResponseBodyResource self = new GetResourcesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetResourcesResponseBodyResource setResourceAttributes(java.util.Map<String, ?> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public java.util.Map<String, ?> getResourceAttributes() {
            return this.resourceAttributes;
        }

        public GetResourcesResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The resource properties in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Status&quot;:&quot;Available&quot;,&quot;Description&quot;:&quot;&quot;,&quot;AccountPrivilege&quot;:&quot;RoleReadWrite&quot;,&quot;InstanceId&quot;:&quot;r-2ze8v41uei31lo****&quot;,&quot;RegionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;AccountType&quot;:&quot;Normal&quot;,&quot;TypeInfo&quot;:{},&quot;AccountName&quot;:&quot;cctest&quot;}</p>
         */
        @NameInMap("resourceAttributes")
        public java.util.Map<String, ?> resourceAttributes;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cctest</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        public static GetResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            GetResourcesResponseBodyResources self = new GetResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public GetResourcesResponseBodyResources setResourceAttributes(java.util.Map<String, ?> resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public java.util.Map<String, ?> getResourceAttributes() {
            return this.resourceAttributes;
        }

        public GetResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
