// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelQrCodeDetailResponseBody extends TeaModel {
    /**
     * <p>The QR code configuration details of the channel. If no QR code configuration process exists for the channel under the specified runtime, this field is empty.</p>
     */
    @NameInMap("Data")
    public GetRuntimeChannelQrCodeDetailResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRuntimeChannelQrCodeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelQrCodeDetailResponseBody self = new GetRuntimeChannelQrCodeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelQrCodeDetailResponseBody setData(GetRuntimeChannelQrCodeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuntimeChannelQrCodeDetailResponseBodyData getData() {
        return this.data;
    }

    public GetRuntimeChannelQrCodeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRuntimeChannelQrCodeDetailResponseBodyData extends TeaModel {
        /**
         * <p>The URL or content of the QR code. If the QR code is not generated or the content is empty, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://qr.example.com/abc">https://qr.example.com/abc</a></p>
         */
        @NameInMap("QrCode")
        public String qrCode;

        /**
         * <p>The access URL of the QR code configuration channel page. It is generated and sent to the user when the QR code configuration is initiated, and carries the taskId, channel code, and region parameters of the current process. If the URL is not recorded, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&code=dingtalk-connector&region=cn-shanghai">https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&amp;code=dingtalk-connector&amp;region=cn-shanghai</a></p>
         */
        @NameInMap("QrCodeNotifyUrl")
        public String qrCodeNotifyUrl;

        /**
         * <p>The QR code scan status. Valid values:</p>
         * <ul>
         * <li>Generating: The QR code is being generated.</li>
         * <li>Generated: The QR code is generated.</li>
         * <li>GenerateFailed: The QR code generation failed.</li>
         * <li>Scanned: The QR code is scanned.</li>
         * <li>Configuring: The configuration is in progress.</li>
         * <li>Success: The configuration is successful.</li>
         * <li>Failed: The configuration failed.</li>
         * <li>Expired: The process has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Generated</p>
         */
        @NameInMap("QrCodeStatus")
        public String qrCodeStatus;

        /**
         * <p>The status of the QR code configuration process. The value is the same as QrCodeStatus. Valid values:</p>
         * <ul>
         * <li>Generating: The QR code is being generated.</li>
         * <li>Generated: The QR code is generated.</li>
         * <li>GenerateFailed: The QR code generation failed.</li>
         * <li>Scanned: The QR code is scanned.</li>
         * <li>Configuring: The configuration is in progress.</li>
         * <li>Success: The configuration is successful.</li>
         * <li>Failed: The configuration failed.</li>
         * <li>Expired: The process has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetRuntimeChannelQrCodeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeChannelQrCodeDetailResponseBodyData self = new GetRuntimeChannelQrCodeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuntimeChannelQrCodeDetailResponseBodyData setQrCode(String qrCode) {
            this.qrCode = qrCode;
            return this;
        }
        public String getQrCode() {
            return this.qrCode;
        }

        public GetRuntimeChannelQrCodeDetailResponseBodyData setQrCodeNotifyUrl(String qrCodeNotifyUrl) {
            this.qrCodeNotifyUrl = qrCodeNotifyUrl;
            return this;
        }
        public String getQrCodeNotifyUrl() {
            return this.qrCodeNotifyUrl;
        }

        public GetRuntimeChannelQrCodeDetailResponseBodyData setQrCodeStatus(String qrCodeStatus) {
            this.qrCodeStatus = qrCodeStatus;
            return this;
        }
        public String getQrCodeStatus() {
            return this.qrCodeStatus;
        }

        public GetRuntimeChannelQrCodeDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
