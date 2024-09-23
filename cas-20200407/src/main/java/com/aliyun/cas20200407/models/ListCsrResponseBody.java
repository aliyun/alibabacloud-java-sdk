// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCsrResponseBody extends TeaModel {
    /**
     * <p>The CSRs.</p>
     */
    @NameInMap("CsrList")
    public java.util.List<ListCsrResponseBodyCsrList> csrList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E865F6AD-0294-4A24-A58B-DAC6BE2BDD20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsrResponseBody self = new ListCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsrResponseBody setCsrList(java.util.List<ListCsrResponseBodyCsrList> csrList) {
        this.csrList = csrList;
        return this;
    }
    public java.util.List<ListCsrResponseBodyCsrList> getCsrList() {
        return this.csrList;
    }

    public ListCsrResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsrResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCsrResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCsrResponseBodyCsrList extends TeaModel {
        /**
         * <p>The algorithm. Valid values: RSA, SM2, and ECC.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The primary domain name, which is a common name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The name of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>corp_name</p>
         */
        @NameInMap("CorpName")
        public String corpName;

        /**
         * <p>The code of the country or region in which the organization is located. For example, you can use CN to indicate China and use US to indicate the United States. The default value is the code of the country or region in which the organization is located. The organization is associated with the intermediate CA certificate from which the certificate is issued. For more information about country codes, see the &quot;Country codes&quot; section of the <a href="https://help.aliyun.com/document_detail/198289.html">Manage company profiles</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The ID of the CSR.</p>
         * 
         * <strong>example:</strong>
         * <p>3454</p>
         */
        @NameInMap("CsrId")
        public Long csrId;

        /**
         * <p>The department that uses the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>Indicates whether the certificate contains a private key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPrivateKey")
        public Boolean hasPrivateKey;

        /**
         * <p>The public key that is calculated by using the SHA256 algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("KeySha2")
        public String keySha2;

        /**
         * <p>The key length that is used by the algorithm. The key length for RSA algorithms can be 2,048, 3,072, and 4,096 bits. The key length for ECC and SM2 algorithms can be 256 bits.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The city where the company is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("Locality")
        public String locality;

        /**
         * <p>The name of the CSR.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The province or location.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The secondary domain names. Separate multiple domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,www.aliyundoc.com">www.example.com,www.aliyundoc.com</a></p>
         */
        @NameInMap("Sans")
        public String sans;

        public static ListCsrResponseBodyCsrList build(java.util.Map<String, ?> map) throws Exception {
            ListCsrResponseBodyCsrList self = new ListCsrResponseBodyCsrList();
            return TeaModel.build(map, self);
        }

        public ListCsrResponseBodyCsrList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListCsrResponseBodyCsrList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCsrResponseBodyCsrList setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCsrResponseBodyCsrList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public ListCsrResponseBodyCsrList setCsrId(Long csrId) {
            this.csrId = csrId;
            return this;
        }
        public Long getCsrId() {
            return this.csrId;
        }

        public ListCsrResponseBodyCsrList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListCsrResponseBodyCsrList setHasPrivateKey(Boolean hasPrivateKey) {
            this.hasPrivateKey = hasPrivateKey;
            return this;
        }
        public Boolean getHasPrivateKey() {
            return this.hasPrivateKey;
        }

        public ListCsrResponseBodyCsrList setKeySha2(String keySha2) {
            this.keySha2 = keySha2;
            return this;
        }
        public String getKeySha2() {
            return this.keySha2;
        }

        public ListCsrResponseBodyCsrList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListCsrResponseBodyCsrList setLocality(String locality) {
            this.locality = locality;
            return this;
        }
        public String getLocality() {
            return this.locality;
        }

        public ListCsrResponseBodyCsrList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCsrResponseBodyCsrList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListCsrResponseBodyCsrList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

    }

}
