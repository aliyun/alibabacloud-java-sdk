// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentOARResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>57784EDF-7322-1559-89C2-26A08570B26B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentOARResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentOARResponseBody self = new SegmentOARResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentOARResponseBody setData(SegmentOARResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentOARResponseBodyData getData() {
        return this.data;
    }

    public SegmentOARResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentOARResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentOARResponseBodyData extends TeaModel {
        @NameInMap("MaskList")
        public java.util.List<String> maskList;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=iB16ms28Y5mzB11ghYUd7upCi4">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=iB16ms28Y5mzB11ghYUd7upCi4</a>****</p>
         */
        @NameInMap("ResultURL")
        public String resultURL;

        public static SegmentOARResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentOARResponseBodyData self = new SegmentOARResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentOARResponseBodyData setMaskList(java.util.List<String> maskList) {
            this.maskList = maskList;
            return this;
        }
        public java.util.List<String> getMaskList() {
            return this.maskList;
        }

        public SegmentOARResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
