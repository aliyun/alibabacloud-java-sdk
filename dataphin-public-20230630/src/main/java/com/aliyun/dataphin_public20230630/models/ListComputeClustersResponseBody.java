// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeClustersResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The page size. Valid values: 1 to 50. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether a token for the next query exists. If NextToken is empty, no more results are available. If NextToken is returned, the value indicates the token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3adOhYj269roQctwr/Eik+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListComputeClustersResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListComputeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeClustersResponseBody self = new ListComputeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeClustersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComputeClustersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListComputeClustersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComputeClustersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListComputeClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComputeClustersResponseBody setPageResult(ListComputeClustersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListComputeClustersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListComputeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeClustersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComputeClustersResponseBodyPageResultClusterList extends TeaModel {
        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012211</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Des")
        public String des;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The user who last modified the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>30012211</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The user who last modified the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <p>The time when the cluster was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>CDH6</p>
         */
        @NameInMap("TypeVersion")
        public String typeVersion;

        public static ListComputeClustersResponseBodyPageResultClusterList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeClustersResponseBodyPageResultClusterList self = new ListComputeClustersResponseBodyPageResultClusterList();
            return TeaModel.build(map, self);
        }

        public ListComputeClustersResponseBodyPageResultClusterList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeClustersResponseBodyPageResultClusterList setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

    public static class ListComputeClustersResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paged list of clusters.</p>
         */
        @NameInMap("ClusterList")
        public java.util.List<ListComputeClustersResponseBodyPageResultClusterList> clusterList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListComputeClustersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListComputeClustersResponseBodyPageResult self = new ListComputeClustersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListComputeClustersResponseBodyPageResult setClusterList(java.util.List<ListComputeClustersResponseBodyPageResultClusterList> clusterList) {
            this.clusterList = clusterList;
            return this;
        }
        public java.util.List<ListComputeClustersResponseBodyPageResultClusterList> getClusterList() {
            return this.clusterList;
        }

        public ListComputeClustersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
