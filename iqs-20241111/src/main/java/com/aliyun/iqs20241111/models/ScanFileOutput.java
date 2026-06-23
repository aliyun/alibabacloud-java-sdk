// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScanFileOutput extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of scan result objects.</p>
     */
    @NameInMap("scanFileInfoList")
    public java.util.List<ScanFileInfo> scanFileInfoList;

    /**
     * <p>The search execution information.</p>
     */
    @NameInMap("searchInformation")
    public UnifiedSearchInformation searchInformation;

    public static ScanFileOutput build(java.util.Map<String, ?> map) throws Exception {
        ScanFileOutput self = new ScanFileOutput();
        return TeaModel.build(map, self);
    }

    public ScanFileOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanFileOutput setScanFileInfoList(java.util.List<ScanFileInfo> scanFileInfoList) {
        this.scanFileInfoList = scanFileInfoList;
        return this;
    }
    public java.util.List<ScanFileInfo> getScanFileInfoList() {
        return this.scanFileInfoList;
    }

    public ScanFileOutput setSearchInformation(UnifiedSearchInformation searchInformation) {
        this.searchInformation = searchInformation;
        return this;
    }
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

}
