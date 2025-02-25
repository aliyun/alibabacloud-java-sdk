// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListVirtualResourceResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The virtual resource groups.</p>
     */
    @NameInMap("VirtualResources")
    public java.util.List<ListVirtualResourceResponseBodyVirtualResources> virtualResources;

    public static ListVirtualResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualResourceResponseBody self = new ListVirtualResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualResourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVirtualResourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVirtualResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVirtualResourceResponseBody setVirtualResources(java.util.List<ListVirtualResourceResponseBodyVirtualResources> virtualResources) {
        this.virtualResources = virtualResources;
        return this;
    }
    public java.util.List<ListVirtualResourceResponseBodyVirtualResources> getVirtualResources() {
        return this.virtualResources;
    }

    public static class ListVirtualResourceResponseBodyVirtualResources extends TeaModel {
        /**
         * <p>The time when the virtual resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T17:52:49Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of deployed services.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceCount")
        public Integer serviceCount;

        /**
         * <p>The time when the virtual resource group was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T19:52:49Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-vr-npovr28onap1xxxxxx</p>
         */
        @NameInMap("VirtualResourceId")
        public String virtualResourceId;

        /**
         * <p>The name of the virtual resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyVirtualResource</p>
         */
        @NameInMap("VirtualResourceName")
        public String virtualResourceName;

        public static ListVirtualResourceResponseBodyVirtualResources build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualResourceResponseBodyVirtualResources self = new ListVirtualResourceResponseBodyVirtualResources();
            return TeaModel.build(map, self);
        }

        public ListVirtualResourceResponseBodyVirtualResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVirtualResourceResponseBodyVirtualResources setServiceCount(Integer serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }
        public Integer getServiceCount() {
            return this.serviceCount;
        }

        public ListVirtualResourceResponseBodyVirtualResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListVirtualResourceResponseBodyVirtualResources setVirtualResourceId(String virtualResourceId) {
            this.virtualResourceId = virtualResourceId;
            return this;
        }
        public String getVirtualResourceId() {
            return this.virtualResourceId;
        }

        public ListVirtualResourceResponseBodyVirtualResources setVirtualResourceName(String virtualResourceName) {
            this.virtualResourceName = virtualResourceName;
            return this;
        }
        public String getVirtualResourceName() {
            return this.virtualResourceName;
        }

    }

}
