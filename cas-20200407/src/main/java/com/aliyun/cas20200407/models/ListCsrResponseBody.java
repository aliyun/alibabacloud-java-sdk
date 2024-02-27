// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCsrResponseBody extends TeaModel {
    @NameInMap("CsrList")
    public java.util.List<ListCsrResponseBodyCsrList> csrList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Long showSize;

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
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("CommonName")
        public String commonName;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>CSR ID。</p>
         */
        @NameInMap("CsrId")
        public Long csrId;

        @NameInMap("Department")
        public String department;

        @NameInMap("HasPrivateKey")
        public Boolean hasPrivateKey;

        @NameInMap("KeySha2")
        public String keySha2;

        @NameInMap("KeySize")
        public Integer keySize;

        @NameInMap("Locality")
        public String locality;

        @NameInMap("Name")
        public String name;

        @NameInMap("Province")
        public String province;

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
