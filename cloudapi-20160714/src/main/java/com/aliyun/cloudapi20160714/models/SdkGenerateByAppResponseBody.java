// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UEsDBBQACAAIADdwnFQAAAAAAAAAAAAAAAA2AAAAQ0FTREtfSkFWQV8xMjI3NDY2NjY0MzM0MTMzXzE2NTExMjU3MD......</p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <strong>example:</strong>
     * <p>61A16D46-EC04-5288-8A18-811B0F536CC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdkGenerateByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppResponseBody self = new SdkGenerateByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public SdkGenerateByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
