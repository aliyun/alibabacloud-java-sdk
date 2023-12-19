// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class GetTempFileDownloadLinkRequest extends TeaModel {
    /**
     * <p>The key that is used to download a file.</p>
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
