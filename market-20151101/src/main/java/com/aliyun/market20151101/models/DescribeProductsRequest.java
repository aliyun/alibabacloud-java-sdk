// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductsRequest extends TeaModel {
    /**
     * <p>The list of filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeProductsRequestFilter> filter;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of products to display per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>镜像</p>
     */
    @NameInMap("SearchTerm")
    public String searchTerm;

    public static DescribeProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductsRequest self = new DescribeProductsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductsRequest setFilter(java.util.List<DescribeProductsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeProductsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProductsRequest setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }
    public String getSearchTerm() {
        return this.searchTerm;
    }

    public static class DescribeProductsRequestFilter extends TeaModel {
        /**
         * <p>The category of the search tag. Valid values:</p>
         * <ul>
         * <li>sort: the sorting method</li>
         * <li>categoryId: the category ID</li>
         * <li>productType: the product type</li>
         * <li>aliyunUid: the Alibaba Cloud account ID of the service provider that owns the product.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>categoryId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the search label:</p>
         * <ul>
         * <li><p>sort</p>
         * <ul>
         * <li>user_count-desc: number of transactions in the last 180 days</li>
         * <li>created_on-desc: creation time</li>
         * <li>price-desc: price</li>
         * <li>score-desc: rating</li>
         * </ul>
         * </li>
         * <li><p>categoryId </p>
         * <ul>
         * <li>Software Marketplace  53366009<ul>
         * <li>Runtime Environment  53448001</li>
         * </ul>
         * <ul>
         * <li>Management &amp; Monitoring  53690006</li>
         * <li>Website Building System  53616009</li>
         * <li>Application Development  55530001</li>
         * <li>Database  56024006</li>
         * <li>Server Software  56014009</li>
         * <li>Network Feature Software  56368007</li>
         * <li>Operating System  57742013</li>
         * </ul>
         * </li>
         * <li>Service Marketplace  52734001<ul>
         * <li>Data Migration  52738004</li>
         * <li>Environment Configuration  52746001</li>
         * <li>Troubleshooting  52740002</li>
         * <li>Security O&amp;M  52732002</li>
         * <li>Custom Development  56082003</li>
         * <li>Training &amp; Certification  57252001</li>
         * <li>Dedicated Line Access  57392001</li>
         * <li>Enterprise Services  56838014</li>
         * <li>Security Services  57004003</li>
         * </ul>
         * </li>
         * <li>Website Building Marketplace  52738001<ul>
         * <li>Enterprise Display  52738005</li>
         * <li>E-commerce  52750001</li>
         * <li>Mobile Website  52752001</li>
         * <li>Design  52732003</li>
         * <li>Information Portal  52744002</li>
         * <li>After-sales Service  52744003</li>
         * <li>Community Forum  55586021</li>
         * <li>Mobile Marketing  55514022</li>
         * <li>Template Website  56598032</li>
         * <li>Website Hosting  57342011</li>
         * </ul>
         * </li>
         * <li>Cloud Security Marketplace  56764045<ul>
         * <li>Host Security  56832023</li>
         * <li>Application Security  56846020</li>
         * <li>Data Security  56824015</li>
         * <li>Security Management  56830014</li>
         * <li>Network Security  56820014</li>
         * </ul>
         * </li>
         * <li>Enterprise Applications  56832009<ul>
         * <li>Office Management  56778013</li>
         * <li>Financial Management  56764034</li>
         * <li>HR Management  56780006</li>
         * <li>Sales Management  56842010</li>
         * <li>Advertising &amp; Marketing  56842011</li>
         * <li>Foreign Trade  56790007</li>
         * <li>Cloud Communications  57602001</li>
         * <li>Supply Chain Management  57604001</li>
         * <li>Data Services  57606001</li>
         * </ul>
         * </li>
         * <li>Solutions  56848023<ul>
         * <li>E-commerce  56848024</li>
         * <li>Finance  56820017</li>
         * <li>Logistics  56776025</li>
         * <li>Government  56842031</li>
         * <li>Multimedia  56784018</li>
         * <li>IoT  56794026</li>
         * <li>Big Data  56792022</li>
         * </ul>
         * </li>
         * <li>API Marketplace  56956004<ul>
         * <li>E-commerce  56928004</li>
         * <li>Finance &amp; Investment  57000002</li>
         * <li>Transportation &amp; Geography  57002002</li>
         * <li>Enterprise Management  56928005</li>
         * <li>Public Affairs  57002003</li>
         * <li>Meteorology &amp; Water Resources  57096001</li>
         * <li>Artificial Intelligence  57124001</li>
         * <li>Lifestyle Services  57126001</li>
         * </ul>
         * </li>
         * <li>IoT Marketplace  201194001<ul>
         * <li>Integrated Systems  201196001</li>
         * <li>Smart Hardware  201198001</li>
         * <li>Modules  201200001</li>
         * <li>Sensors  201192002</li>
         * <li>Chips  201202001</li>
         * <li>IoT Applications  201196002</li>
         * <li>IoT Services  201196003</li>
         * </ul>
         * </li>
         * <li>Data Intelligence  201204005<ul>
         * <li>Data Analytics &amp; Visualization  201190008</li>
         * <li>Public Opinion Analysis  201198004</li>
         * <li>E-commerce &amp; Marketing  201202006</li>
         * <li>Artificial Intelligence  201204006</li>
         * <li>Meteorology &amp; Transportation  201214006</li>
         * <li>Finance &amp; Accounting  201208013</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p>productType:</p>
         * <ul>
         * <li>APP: application</li>
         * <li>SERVICE: service</li>
         * <li>MIRROR: image</li>
         * <li>DOWNLOAD: download</li>
         * <li>API_SERVICE: API.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>53366009</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeProductsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductsRequestFilter self = new DescribeProductsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeProductsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeProductsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
