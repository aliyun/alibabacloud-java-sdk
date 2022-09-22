// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceSpecDetailResponseBody extends TeaModel {
    @NameInMap("CsCdnTraffic")
    public Long csCdnTraffic;

    @NameInMap("CsDownloadCount")
    public Long csDownloadCount;

    @NameInMap("CsStorageSize")
    public Long csStorageSize;

    @NameInMap("CsUploadCount")
    public Long csUploadCount;

    @NameInMap("DbReadCount")
    public Long dbReadCount;

    @NameInMap("DbStorageSize")
    public Long dbStorageSize;

    @NameInMap("DbWriteCount")
    public Long dbWriteCount;

    @NameInMap("FcCost")
    public Long fcCost;

    @NameInMap("FcRequestCount")
    public Long fcRequestCount;

    @NameInMap("FcTxTraffic")
    public Long fcTxTraffic;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("SpecDetailText")
    public String specDetailText;

    @NameInMap("WhCdnTraffic")
    public Long whCdnTraffic;

    @NameInMap("WhStorageSize")
    public Long whStorageSize;

    public static QuerySpaceSpecDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceSpecDetailResponseBody self = new QuerySpaceSpecDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpaceSpecDetailResponseBody setCsCdnTraffic(Long csCdnTraffic) {
        this.csCdnTraffic = csCdnTraffic;
        return this;
    }
    public Long getCsCdnTraffic() {
        return this.csCdnTraffic;
    }

    public QuerySpaceSpecDetailResponseBody setCsDownloadCount(Long csDownloadCount) {
        this.csDownloadCount = csDownloadCount;
        return this;
    }
    public Long getCsDownloadCount() {
        return this.csDownloadCount;
    }

    public QuerySpaceSpecDetailResponseBody setCsStorageSize(Long csStorageSize) {
        this.csStorageSize = csStorageSize;
        return this;
    }
    public Long getCsStorageSize() {
        return this.csStorageSize;
    }

    public QuerySpaceSpecDetailResponseBody setCsUploadCount(Long csUploadCount) {
        this.csUploadCount = csUploadCount;
        return this;
    }
    public Long getCsUploadCount() {
        return this.csUploadCount;
    }

    public QuerySpaceSpecDetailResponseBody setDbReadCount(Long dbReadCount) {
        this.dbReadCount = dbReadCount;
        return this;
    }
    public Long getDbReadCount() {
        return this.dbReadCount;
    }

    public QuerySpaceSpecDetailResponseBody setDbStorageSize(Long dbStorageSize) {
        this.dbStorageSize = dbStorageSize;
        return this;
    }
    public Long getDbStorageSize() {
        return this.dbStorageSize;
    }

    public QuerySpaceSpecDetailResponseBody setDbWriteCount(Long dbWriteCount) {
        this.dbWriteCount = dbWriteCount;
        return this;
    }
    public Long getDbWriteCount() {
        return this.dbWriteCount;
    }

    public QuerySpaceSpecDetailResponseBody setFcCost(Long fcCost) {
        this.fcCost = fcCost;
        return this;
    }
    public Long getFcCost() {
        return this.fcCost;
    }

    public QuerySpaceSpecDetailResponseBody setFcRequestCount(Long fcRequestCount) {
        this.fcRequestCount = fcRequestCount;
        return this;
    }
    public Long getFcRequestCount() {
        return this.fcRequestCount;
    }

    public QuerySpaceSpecDetailResponseBody setFcTxTraffic(Long fcTxTraffic) {
        this.fcTxTraffic = fcTxTraffic;
        return this;
    }
    public Long getFcTxTraffic() {
        return this.fcTxTraffic;
    }

    public QuerySpaceSpecDetailResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QuerySpaceSpecDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpaceSpecDetailResponseBody setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public QuerySpaceSpecDetailResponseBody setSpecDetailText(String specDetailText) {
        this.specDetailText = specDetailText;
        return this;
    }
    public String getSpecDetailText() {
        return this.specDetailText;
    }

    public QuerySpaceSpecDetailResponseBody setWhCdnTraffic(Long whCdnTraffic) {
        this.whCdnTraffic = whCdnTraffic;
        return this;
    }
    public Long getWhCdnTraffic() {
        return this.whCdnTraffic;
    }

    public QuerySpaceSpecDetailResponseBody setWhStorageSize(Long whStorageSize) {
        this.whStorageSize = whStorageSize;
        return this;
    }
    public Long getWhStorageSize() {
        return this.whStorageSize;
    }

}
