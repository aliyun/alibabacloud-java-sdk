// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ExportUserDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://sase-export.oss-cn-hangzhou.aliyuncs.com/export%2Fapp-device%2F20240607154831.xlsx?Expires=1717746571&OSSAccessKeyId=">https://sase-export.oss-cn-hangzhou.aliyuncs.com/export%2Fapp-device%2F20240607154831.xlsx?Expires=1717746571&amp;OSSAccessKeyId=</a>********************</p>
     */
    @NameInMap("SignedUrl")
    public String signedUrl;

    public static ExportUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportUserDevicesResponseBody self = new ExportUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportUserDevicesResponseBody setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
        return this;
    }
    public String getSignedUrl() {
        return this.signedUrl;
    }

}
