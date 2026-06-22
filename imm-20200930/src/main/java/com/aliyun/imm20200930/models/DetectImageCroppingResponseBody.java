// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingResponseBody extends TeaModel {
    /**
     * <p>The array of image cropping information.</p>
     */
    @NameInMap("Croppings")
    public java.util.List<CroppingSuggestion> croppings;

    /**
     * <p>The list of objects included in the cropping region, corresponding to the InclusionHints input parameter. This field is empty if no objects are included.</p>
     */
    @NameInMap("MatchedInclusionHints")
    public java.util.List<String> matchedInclusionHints;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91AC8C98-0F36-49D2-8290-742E24D*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageCroppingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingResponseBody self = new DetectImageCroppingResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingResponseBody setCroppings(java.util.List<CroppingSuggestion> croppings) {
        this.croppings = croppings;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppings() {
        return this.croppings;
    }

    public DetectImageCroppingResponseBody setMatchedInclusionHints(java.util.List<String> matchedInclusionHints) {
        this.matchedInclusionHints = matchedInclusionHints;
        return this;
    }
    public java.util.List<String> getMatchedInclusionHints() {
        return this.matchedInclusionHints;
    }

    public DetectImageCroppingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
