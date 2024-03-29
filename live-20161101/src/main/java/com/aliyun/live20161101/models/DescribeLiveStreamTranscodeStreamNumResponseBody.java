// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponseBody extends TeaModel {
    @NameInMap("LazyTranscodedNumber")
    public Long lazyTranscodedNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("TranscodedNumber")
    public Long transcodedNumber;

    @NameInMap("UntranscodeNumber")
    public Long untranscodeNumber;

    public static DescribeLiveStreamTranscodeStreamNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumResponseBody self = new DescribeLiveStreamTranscodeStreamNumResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTranscodedNumber(Long transcodedNumber) {
        this.transcodedNumber = transcodedNumber;
        return this;
    }
    public Long getTranscodedNumber() {
        return this.transcodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setUntranscodeNumber(Long untranscodeNumber) {
        this.untranscodeNumber = untranscodeNumber;
        return this;
    }
    public Long getUntranscodeNumber() {
        return this.untranscodeNumber;
    }

}
