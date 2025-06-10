// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationResponseBody extends TeaModel {
    @NameInMap("Data")
    public RunCTRegistrationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EB3ACFE6-EA75-49E1-83C0-953580F74D88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCTRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationResponseBody self = new RunCTRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationResponseBody setData(RunCTRegistrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunCTRegistrationResponseBodyData getData() {
        return this.data;
    }

    public RunCTRegistrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunCTRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCTRegistrationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/chest-ct-registration/ctctreg/2020-09-05_13%3A59%3A59_894c42d0-876a-9198-9fd9-09431fb96fad.tar.gz?Expires=1599287399&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=cWTQtdb7geuEJ46cNO%2BGGimrN">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/chest-ct-registration/ctctreg/2020-09-05_13%3A59%3A59_894c42d0-876a-9198-9fd9-09431fb96fad.tar.gz?Expires=1599287399&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=cWTQtdb7geuEJ46cNO%2BGGimrN</a>****</p>
         */
        @NameInMap("DUrl")
        public String DUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/chest-ct-registration/ctctreg/2020-09-05_13%3A59%3A59_894c42d0-876a-9198-9fd9-09431fb96fad.nii.gz?Expires=1599287399&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=Tgjk1WsZFvvyIUMunxizNtivhY">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/chest-ct-registration/ctctreg/2020-09-05_13%3A59%3A59_894c42d0-876a-9198-9fd9-09431fb96fad.nii.gz?Expires=1599287399&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=Tgjk1WsZFvvyIUMunxizNtivhY</a>****</p>
         */
        @NameInMap("NUrl")
        public String NUrl;

        public static RunCTRegistrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationResponseBodyData self = new RunCTRegistrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationResponseBodyData setDUrl(String DUrl) {
            this.DUrl = DUrl;
            return this;
        }
        public String getDUrl() {
            return this.DUrl;
        }

        public RunCTRegistrationResponseBodyData setNUrl(String NUrl) {
            this.NUrl = NUrl;
            return this;
        }
        public String getNUrl() {
            return this.NUrl;
        }

    }

}
