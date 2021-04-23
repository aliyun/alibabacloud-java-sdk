// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponseBody extends TeaModel {
    @NameInMap("UntranscodeNumber")
    public Long untranscodeNumber;

    @NameInMap("LazyTranscodedNumber")
    public Long lazyTranscodedNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodedNumber")
    public Long transcodedNumber;

    @NameInMap("Total")
    public Long total;

    public static DescribeLiveStreamTranscodeStreamNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumResponseBody self = new DescribeLiveStreamTranscodeStreamNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setUntranscodeNumber(Long untranscodeNumber) {
        this.untranscodeNumber = untranscodeNumber;
        return this;
    }
    public Long getUntranscodeNumber() {
        return this.untranscodeNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setLazyTranscodedNumber(Long lazyTranscodedNumber) {
        this.lazyTranscodedNumber = lazyTranscodedNumber;
        return this;
    }
    public Long getLazyTranscodedNumber() {
        return this.lazyTranscodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTranscodedNumber(Long transcodedNumber) {
        this.transcodedNumber = transcodedNumber;
        return this;
    }
    public Long getTranscodedNumber() {
        return this.transcodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
