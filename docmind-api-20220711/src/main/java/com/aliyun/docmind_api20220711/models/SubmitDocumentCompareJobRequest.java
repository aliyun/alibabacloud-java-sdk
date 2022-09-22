// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitDocumentCompareJobRequest extends TeaModel {
    @NameInMap("CompareFileName")
    public String compareFileName;

    @NameInMap("CompareFileUrl")
    public String compareFileUrl;

    @NameInMap("OriginFileName")
    public String originFileName;

    @NameInMap("OriginFileUrl")
    public String originFileUrl;

    public static SubmitDocumentCompareJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocumentCompareJobRequest self = new SubmitDocumentCompareJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocumentCompareJobRequest setCompareFileName(String compareFileName) {
        this.compareFileName = compareFileName;
        return this;
    }
    public String getCompareFileName() {
        return this.compareFileName;
    }

    public SubmitDocumentCompareJobRequest setCompareFileUrl(String compareFileUrl) {
        this.compareFileUrl = compareFileUrl;
        return this;
    }
    public String getCompareFileUrl() {
        return this.compareFileUrl;
    }

    public SubmitDocumentCompareJobRequest setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
        return this;
    }
    public String getOriginFileName() {
        return this.originFileName;
    }

    public SubmitDocumentCompareJobRequest setOriginFileUrl(String originFileUrl) {
        this.originFileUrl = originFileUrl;
        return this;
    }
    public String getOriginFileUrl() {
        return this.originFileUrl;
    }

}
