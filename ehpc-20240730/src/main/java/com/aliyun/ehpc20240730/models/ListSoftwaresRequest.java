// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListSoftwaresRequest extends TeaModel {
    /**
     * <p>The application category.</p>
     * 
     * <strong>example:</strong>
     * <p>NWP</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The software name.</p>
     * 
     * <strong>example:</strong>
     * <p>gromacs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operating system (OS) information.</p>
     */
    @NameInMap("OsInfos")
    public java.util.List<ListSoftwaresRequestOsInfos> osInfos;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListSoftwaresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresRequest self = new ListSoftwaresRequest();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListSoftwaresRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListSoftwaresRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSoftwaresRequest setOsInfos(java.util.List<ListSoftwaresRequestOsInfos> osInfos) {
        this.osInfos = osInfos;
        return this;
    }
    public java.util.List<ListSoftwaresRequestOsInfos> getOsInfos() {
        return this.osInfos;
    }

    public ListSoftwaresRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListSoftwaresRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public static class ListSoftwaresRequestOsInfos extends TeaModel {
        /**
         * <p>The OS architecture. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.9_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        public static ListSoftwaresRequestOsInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresRequestOsInfos self = new ListSoftwaresRequestOsInfos();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresRequestOsInfos setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListSoftwaresRequestOsInfos setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

    }

}
