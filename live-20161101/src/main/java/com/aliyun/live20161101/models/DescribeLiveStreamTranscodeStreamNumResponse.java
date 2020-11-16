// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("TranscodedNumber")
    @Validation(required = true)
    public Long transcodedNumber;

    @NameInMap("UntranscodeNumber")
    @Validation(required = true)
    public Long untranscodeNumber;

    @NameInMap("LazyTranscodedNumber")
    @Validation(required = true)
    public Long lazyTranscodedNumber;

    public static DescribeLiveStreamTranscodeStreamNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumResponse self = new DescribeLiveStreamTranscodeStreamNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setTranscodedNumber(Long transcodedNumber) {
        this.transcodedNumber = transcodedNumber;
        return this;
    }
    public Long getTranscodedNumber() {
        return this.transcodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setUntranscodeNumber(Long untranscodeNumber) {
        this.untranscodeNumber = untranscodeNumber;
        return this;
    }
    public Long getUntranscodeNumber() {
        return this.untranscodeNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setLazyTranscodedNumber(Long lazyTranscodedNumber) {
        this.lazyTranscodedNumber = lazyTranscodedNumber;
        return this;
    }
    public Long getLazyTranscodedNumber() {
        return this.lazyTranscodedNumber;
    }

}
