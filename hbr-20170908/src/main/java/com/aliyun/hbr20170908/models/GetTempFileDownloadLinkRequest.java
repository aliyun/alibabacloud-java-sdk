// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTempFileDownloadLinkRequest extends TeaModel {
    /**
     * <p>The key that is used to download a file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temp/1797733170015112/report/r-000jdzknbp39cnf9hs99/r-000jdzknbp39cnf9hs99-total.csv</p>
     */
    @NameInMap("TempFileKey")
    public String tempFileKey;

    public static GetTempFileDownloadLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTempFileDownloadLinkRequest self = new GetTempFileDownloadLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTempFileDownloadLinkRequest setTempFileKey(String tempFileKey) {
        this.tempFileKey = tempFileKey;
        return this;
    }
    public String getTempFileKey() {
        return this.tempFileKey;
    }

}
