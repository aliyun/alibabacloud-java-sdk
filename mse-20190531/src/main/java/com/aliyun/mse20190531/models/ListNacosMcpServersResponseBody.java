// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNacosMcpServersResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListNacosMcpServersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ADDD8AB7-8D1C-4697-A83E-410D2607****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNacosMcpServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNacosMcpServersResponseBody self = new ListNacosMcpServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNacosMcpServersResponseBody setData(ListNacosMcpServersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNacosMcpServersResponseBodyData getData() {
        return this.data;
    }

    public ListNacosMcpServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNacosMcpServersResponseBodyDataPageItemsVersionDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Is_latest")
        public Boolean isLatest;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16</p>
         */
        @NameInMap("Release_date")
        public String releaseDate;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListNacosMcpServersResponseBodyDataPageItemsVersionDetail build(java.util.Map<String, ?> map) throws Exception {
            ListNacosMcpServersResponseBodyDataPageItemsVersionDetail self = new ListNacosMcpServersResponseBodyDataPageItemsVersionDetail();
            return TeaModel.build(map, self);
        }

        public ListNacosMcpServersResponseBodyDataPageItemsVersionDetail setIsLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }
        public Boolean getIsLatest() {
            return this.isLatest;
        }

        public ListNacosMcpServersResponseBodyDataPageItemsVersionDetail setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public ListNacosMcpServersResponseBodyDataPageItemsVersionDetail setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListNacosMcpServersResponseBodyDataPageItems extends TeaModel {
        @NameInMap("Capabilities")
        public java.util.List<String> capabilities;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mcp-sse</p>
         */
        @NameInMap("FrontProtocol")
        public String frontProtocol;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>2385420b-6176-4a37-aba4-d3d382e4bb84</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>stdio</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        @NameInMap("Version")
        public String version;

        @NameInMap("VersionDetail")
        public ListNacosMcpServersResponseBodyDataPageItemsVersionDetail versionDetail;

        public static ListNacosMcpServersResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListNacosMcpServersResponseBodyDataPageItems self = new ListNacosMcpServersResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListNacosMcpServersResponseBodyDataPageItems setCapabilities(java.util.List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setFrontProtocol(String frontProtocol) {
            this.frontProtocol = frontProtocol;
            return this;
        }
        public String getFrontProtocol() {
            return this.frontProtocol;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListNacosMcpServersResponseBodyDataPageItems setVersionDetail(ListNacosMcpServersResponseBodyDataPageItemsVersionDetail versionDetail) {
            this.versionDetail = versionDetail;
            return this;
        }
        public ListNacosMcpServersResponseBodyDataPageItemsVersionDetail getVersionDetail() {
            return this.versionDetail;
        }

    }

    public static class ListNacosMcpServersResponseBodyData extends TeaModel {
        @NameInMap("PageItems")
        public java.util.List<ListNacosMcpServersResponseBodyDataPageItems> pageItems;

        /**
         * <p>pageNumber.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>pagesAvailable.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PagesAvailable")
        public Integer pagesAvailable;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNacosMcpServersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNacosMcpServersResponseBodyData self = new ListNacosMcpServersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNacosMcpServersResponseBodyData setPageItems(java.util.List<ListNacosMcpServersResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListNacosMcpServersResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListNacosMcpServersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNacosMcpServersResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListNacosMcpServersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
