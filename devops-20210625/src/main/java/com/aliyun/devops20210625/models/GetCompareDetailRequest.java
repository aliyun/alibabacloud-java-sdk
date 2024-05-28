// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCompareDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("from")
    public String from;

    @NameInMap("maxDiffByte")
    public Integer maxDiffByte;

    @NameInMap("maxDiffFile")
    public Integer maxDiffFile;

    @NameInMap("mergeBase")
    public Boolean mergeBase;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("to")
    public String to;

    public static GetCompareDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompareDetailRequest self = new GetCompareDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCompareDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetCompareDetailRequest setMaxDiffByte(Integer maxDiffByte) {
        this.maxDiffByte = maxDiffByte;
        return this;
    }
    public Integer getMaxDiffByte() {
        return this.maxDiffByte;
    }

    public GetCompareDetailRequest setMaxDiffFile(Integer maxDiffFile) {
        this.maxDiffFile = maxDiffFile;
        return this;
    }
    public Integer getMaxDiffFile() {
        return this.maxDiffFile;
    }

    public GetCompareDetailRequest setMergeBase(Boolean mergeBase) {
        this.mergeBase = mergeBase;
        return this;
    }
    public Boolean getMergeBase() {
        return this.mergeBase;
    }

    public GetCompareDetailRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetCompareDetailRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
