// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultDetailResponseBody extends TeaModel {
    @NameInMap("AuditResultDetails")
    public java.util.List<GetMediaAuditResultDetailResponseBodyAuditResultDetails> auditResultDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    public static GetMediaAuditResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultDetailResponseBody self = new GetMediaAuditResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultDetailResponseBody setAuditResultDetails(java.util.List<GetMediaAuditResultDetailResponseBodyAuditResultDetails> auditResultDetails) {
        this.auditResultDetails = auditResultDetails;
        return this;
    }
    public java.util.List<GetMediaAuditResultDetailResponseBodyAuditResultDetails> getAuditResultDetails() {
        return this.auditResultDetails;
    }

    public GetMediaAuditResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaAuditResultDetailResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class GetMediaAuditResultDetailResponseBodyAuditResultDetails extends TeaModel {
        @NameInMap("AdLabel")
        public String adLabel;

        @NameInMap("AdScore")
        public String adScore;

        @NameInMap("LiveLabel")
        public String liveLabel;

        @NameInMap("LiveScore")
        public String liveScore;

        @NameInMap("LogoLabel")
        public String logoLabel;

        @NameInMap("LogoScore")
        public String logoScore;

        @NameInMap("PornLabel")
        public String pornLabel;

        @NameInMap("PornScore")
        public String pornScore;

        @NameInMap("TerrorismLabel")
        public String terrorismLabel;

        @NameInMap("TerrorismScore")
        public String terrorismScore;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Url")
        public String url;

        public static GetMediaAuditResultDetailResponseBodyAuditResultDetails build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultDetailResponseBodyAuditResultDetails self = new GetMediaAuditResultDetailResponseBodyAuditResultDetails();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setAdLabel(String adLabel) {
            this.adLabel = adLabel;
            return this;
        }
        public String getAdLabel() {
            return this.adLabel;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setAdScore(String adScore) {
            this.adScore = adScore;
            return this;
        }
        public String getAdScore() {
            return this.adScore;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setLiveLabel(String liveLabel) {
            this.liveLabel = liveLabel;
            return this;
        }
        public String getLiveLabel() {
            return this.liveLabel;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setLiveScore(String liveScore) {
            this.liveScore = liveScore;
            return this;
        }
        public String getLiveScore() {
            return this.liveScore;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setLogoLabel(String logoLabel) {
            this.logoLabel = logoLabel;
            return this;
        }
        public String getLogoLabel() {
            return this.logoLabel;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setLogoScore(String logoScore) {
            this.logoScore = logoScore;
            return this;
        }
        public String getLogoScore() {
            return this.logoScore;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setPornLabel(String pornLabel) {
            this.pornLabel = pornLabel;
            return this;
        }
        public String getPornLabel() {
            return this.pornLabel;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setPornScore(String pornScore) {
            this.pornScore = pornScore;
            return this;
        }
        public String getPornScore() {
            return this.pornScore;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setTerrorismLabel(String terrorismLabel) {
            this.terrorismLabel = terrorismLabel;
            return this;
        }
        public String getTerrorismLabel() {
            return this.terrorismLabel;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setTerrorismScore(String terrorismScore) {
            this.terrorismScore = terrorismScore;
            return this;
        }
        public String getTerrorismScore() {
            return this.terrorismScore;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetMediaAuditResultDetailResponseBodyAuditResultDetails setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
