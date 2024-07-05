// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobDetailResponseBody extends TeaModel {
    /**
     * <p>The results of the content moderation job.</p>
     */
    @NameInMap("MediaCensorJobDetail")
    public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail mediaCensorJobDetail;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B42299E6-F71F-465F-8FE9-4FC2E3D3C2CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaCensorJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobDetailResponseBody self = new QueryMediaCensorJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobDetailResponseBody setMediaCensorJobDetail(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail mediaCensorJobDetail) {
        this.mediaCensorJobDetail = mediaCensorJobDetail;
        return this;
    }
    public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail getMediaCensorJobDetail() {
        return this.mediaCensorJobDetail;
    }

    public QueryMediaCensorJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult extends TeaModel {
        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("Label")
        public String label;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Text")
        public String text;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList extends TeaModel {
        @NameInMap("AudioDetailResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult> audioDetailResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList setAudioDetailResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult> audioDetailResult) {
            this.audioDetailResult = audioDetailResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultListAudioDetailResult> getAudioDetailResult() {
            return this.audioDetailResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult extends TeaModel {
        @NameInMap("AudioDetailResultList")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList audioDetailResultList;

        @NameInMap("Label")
        public String label;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult setAudioDetailResultList(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList audioDetailResultList) {
            this.audioDetailResultList = audioDetailResultList;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResultAudioDetailResultList getAudioDetailResultList() {
            return this.audioDetailResultList;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>spam</strong>: spam</li>
         * <li><strong>ad</strong>: ads</li>
         * <li><strong>abuse</strong>: abuse</li>
         * <li><strong>flood</strong>: excessive junk content</li>
         * <li><strong>contraband</strong>: prohibited content</li>
         * <li><strong>meaningless</strong>: meaningless content</li>
         * <li><strong>normal</strong>: normal content</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Multiple labels are separated with commas (,).</p>
         * <ul>
         * <li><p>Valid values in the pornographic content moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>sexy</strong>: sexy content</li>
         * <li><strong>porn</strong>: pornographic content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the terrorist content moderation scenario:</p>
         * <ul>
         * <li><strong>narmal</strong>: normal content</li>
         * <li><strong>bloody</strong>: bloody content</li>
         * <li><strong>explosion</strong>: explosion and smoke</li>
         * <li><strong>outfit</strong>: special costume</li>
         * <li><strong>logo</strong>: special logo</li>
         * <li><strong>weapon</strong>: weapon</li>
         * <li><strong>politics</strong>: political content</li>
         * <li><strong>violence</strong>: violence</li>
         * <li><strong>crowd</strong>: crowd</li>
         * <li><strong>parade</strong>: parade</li>
         * <li><strong>carcrash</strong>: car accident</li>
         * <li><strong>flag</strong>: flag</li>
         * <li><strong>location</strong>: landmark</li>
         * <li><strong>others</strong>: other content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the ad moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>ad</strong>: other ads</li>
         * <li><strong>politics</strong>: political content in text</li>
         * <li><strong>porn</strong>: pornographic content in text</li>
         * <li><strong>abuse</strong>: abuse in text</li>
         * <li><strong>terrorism</strong>: terrorist content in text</li>
         * <li><strong>contraband</strong>: prohibited content in text</li>
         * <li><strong>spam</strong>: spam in text</li>
         * <li><strong>npx</strong>: illegal ads</li>
         * <li><strong>qrcode</strong>: QR code</li>
         * <li><strong>programCode</strong>: mini program code</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the live moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: picture-in-picture</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the logo moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>TV</strong>: controlled TV station logo</li>
         * <li><strong>trademark</strong>: trademark</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score. Valid values: <strong>0 to 100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: pornographic content moderation</li>
         * <li><strong>terrorism</strong>: terrorist content moderation</li>
         * <li><strong>ad</strong>: ad violation moderation</li>
         * <li><strong>live</strong>: undesirable scene moderation</li>
         * <li><strong>logo</strong>: logo moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> result;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults setResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> getResult() {
            return this.result;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult extends TeaModel {
        /**
         * <p>The OSS bucket that stores the video thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-out-test-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the video thumbnail resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The Object Storage Service (OSS) object that is used as the video thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>test/ai/censor/v2/vme-****.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The moderation results.</p>
         */
        @NameInMap("Results")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults results;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults results) {
            this.results = results;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults getResults() {
            return this.results;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults extends TeaModel {
        @NameInMap("CoverImageCensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults setCoverImageCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult) {
            this.coverImageCensorResult = coverImageCensorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Valid values:</p>
         * <ul>
         * <li><strong>spam</strong>: spam</li>
         * <li><strong>ad</strong>: ads</li>
         * <li><strong>abuse</strong>: abuse</li>
         * <li><strong>flood</strong>: excessive junk content</li>
         * <li><strong>contraband</strong>: prohibited content</li>
         * <li><strong>meaningless</strong>: meaningless content</li>
         * <li><strong>normal</strong>: normal content</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input media file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-test-in-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input media file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input media file.</p>
         * 
         * <strong>example:</strong>
         * <p>test/ai/censor/test-****.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>spam</strong>: spam</li>
         * <li><strong>ad</strong>: ads</li>
         * <li><strong>abuse</strong>: abuse</li>
         * <li><strong>flood</strong>: excessive junk content</li>
         * <li><strong>contraband</strong>: prohibited content</li>
         * <li><strong>meaningless</strong>: meaningless content</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>meaningless</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values: The value is <strong>antispam</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>antispam</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
         * <ul>
         * <li><p>Valid values in the pornographic content moderation scenario:</p>
         * <ul>
         * <li><strong>porn</strong>: pornographic content</li>
         * <li><strong>sexy</strong>: sexy content</li>
         * <li><strong>normal</strong>: normal content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the terrorist content moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>bloody</strong>: bloody content</li>
         * <li><strong>explosion</strong>: explosion and smoke</li>
         * <li><strong>outfit</strong>: special costume</li>
         * <li><strong>logo</strong>: special logo</li>
         * <li><strong>weapon</strong>: weapon</li>
         * <li><strong>politics</strong>: political content</li>
         * <li><strong>violence</strong>: violence</li>
         * <li><strong>crowd</strong>: crowd</li>
         * <li><strong>parade</strong>: parade</li>
         * <li><strong>carcrash</strong>: car accident</li>
         * <li><strong>flag</strong>: flag</li>
         * <li><strong>location</strong>: landmark</li>
         * <li><strong>others</strong>: other content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the ad moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>ad</strong>: other ads</li>
         * <li><strong>politics</strong>: political content in text</li>
         * <li><strong>porn</strong>: pornographic content in text</li>
         * <li><strong>abuse</strong>: abuse in text</li>
         * <li><strong>terrorism</strong>: terrorist content in text</li>
         * <li><strong>contraband</strong>: prohibited content in text</li>
         * <li><strong>spam</strong>: spam in text</li>
         * <li><strong>npx</strong>: illegal ads</li>
         * <li><strong>qrcode</strong>: QR code</li>
         * <li><strong>programCode</strong>: mini program code</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the live moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: picture-in-picture</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the logo moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>TV</strong>: controlled TV station logo</li>
         * <li><strong>trademark</strong>: trademark</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>meaningless</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: pornographic content moderation</li>
         * <li><strong>terrorism</strong>: terrorist content moderation</li>
         * <li><strong>ad</strong>: ad violation moderation</li>
         * <li><strong>live</strong>: undesirable scene moderation</li>
         * <li><strong>logo</strong>: logo moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>terrorism</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults setCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Multiple labels are separated with commas (,). Valid values:</p>
         * <ul>
         * <li><p>Valid values in the pornographic content moderation scenario:</p>
         * <ul>
         * <li><strong>porn</strong>: pornographic content</li>
         * <li><strong>sexy</strong>: sexy content</li>
         * <li><strong>normal</strong>: normal content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the terrorist content moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>bloody</strong>: bloody content</li>
         * <li><strong>explosion</strong>: explosion and smoke</li>
         * <li><strong>outfit</strong>: special costume</li>
         * <li><strong>logo</strong>: special logo</li>
         * <li><strong>weapon</strong>: weapon</li>
         * <li><strong>politics</strong>: political content</li>
         * <li><strong>violence</strong>: violence</li>
         * <li><strong>crowd</strong>: crowd</li>
         * <li><strong>parade</strong>: parade</li>
         * <li><strong>carcrash</strong>: car accident</li>
         * <li><strong>flag</strong>: flag</li>
         * <li><strong>location</strong>: landmark</li>
         * <li><strong>others</strong>: other content</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the ad moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>ad</strong>: other ads</li>
         * <li><strong>politics</strong>: political content in text</li>
         * <li><strong>porn</strong>: pornographic content in text</li>
         * <li><strong>abuse</strong>: abuse in text</li>
         * <li><strong>terrorism</strong>: terrorist content in text</li>
         * <li><strong>contraband</strong>: prohibited content in text</li>
         * <li><strong>spam</strong>: spam in text</li>
         * <li><strong>npx</strong>: illegal ads</li>
         * <li><strong>qrcode</strong>: QR code</li>
         * <li><strong>programCode</strong>: mini program code</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the live moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>meaningless</strong>: meaningless content, such as a black or white screen</li>
         * <li><strong>PIP</strong>: picture-in-picture</li>
         * <li><strong>smoking</strong>: smoking</li>
         * <li><strong>drivelive</strong>: live broadcasting in a running vehicle</li>
         * </ul>
         * </li>
         * <li><p>Valid values in the logo moderation scenario:</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>TV</strong>: controlled TV station logo</li>
         * <li><strong>trademark</strong>: trademark</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn,ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.99</p>
         */
        @NameInMap("Rate")
        public String rate;

        /**
         * <p>The moderation scenario. Valid values:</p>
         * <ul>
         * <li><strong>porn</strong>: pornographic content moderation</li>
         * <li><strong>terrorism</strong>: terrorist content moderation</li>
         * <li><strong>ad</strong>: ad violation moderation</li>
         * <li><strong>live</strong>: undesirable scene moderation</li>
         * <li><strong>logo</strong>: logo moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The recommended subsequent operation. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults setCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline extends TeaModel {
        /**
         * <p>The moderation results that include information such as labels and scores.</p>
         */
        @NameInMap("CensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults;

        /**
         * <p>The one or more OSS objects that are generated as the output snapshots.</p>
         * <blockquote>
         * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>output{Count}.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The position in the video. Format: <code>hh:mm:ss[.SSS]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>00:02:59.999</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines extends TeaModel {
        @NameInMap("VideoTimeline")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines setVideoTimeline(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline) {
            this.videoTimeline = videoTimeline;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult extends TeaModel {
        /**
         * <p>A collection of the moderation results. The information includes the summary of various scenarios such as pornographic content and terrorist content.</p>
         */
        @NameInMap("CensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults censorResults;

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>ea04afcca7cd4e80b9ece8fbb251****</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>The moderation results that are sorted in ascending order by time.</p>
         */
        @NameInMap("VideoTimelines")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines videoTimelines;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setVideoTimelines(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines videoTimelines) {
            this.videoTimelines = videoTimelines;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile extends TeaModel {
        /**
         * <p>The OSS bucket that stores the output snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The region in which the OSS bucket that stores the output snapshot resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The one or more OSS objects that are generated as the output snapshots.</p>
         * <blockquote>
         * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg</code>, <code>output00002-****.jpg</code>, and so on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>output{Count}.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig extends TeaModel {
        /**
         * <p>The custom business type. Default value: common.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The information about output snapshots.</p>
         */
        @NameInMap("OutputFile")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile outputFile;

        /**
         * <p>Indicates whether the video content needs to be moderated. Default value: <strong>true</strong> Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The video content needs to be moderated.</li>
         * <li><strong>false</strong>: The video content does not need to be moderated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VideoCensor")
        public String videoCensor;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setOutputFile(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setVideoCensor(String videoCensor) {
            this.videoCensor = videoCensor;
            return this;
        }
        public String getVideoCensor() {
            return this.videoCensor;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail extends TeaModel {
        @NameInMap("AudioCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult audioCensorResult;

        /**
         * <p>The moderation result of live comments.</p>
         */
        @NameInMap("BarrageCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult barrageCensorResult;

        /**
         * <p>The error code returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The moderation results of thumbnails.</p>
         */
        @NameInMap("CoverImageCensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults coverImageCensorResults;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-13T16:32:24Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The moderation result of the description.</p>
         */
        @NameInMap("DescCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult descCensorResult;

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-21</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput input;

        /**
         * <p>The ID of the content moderation job.</p>
         * 
         * <strong>example:</strong>
         * <p>f8f166eea7a44e9bb0a4aecf9543****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error message returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated cannot be found</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the content moderation job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The overall result of the job. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * <p>If the moderation result of one type of the moderated content is review, the overall result is review. If the moderation result of one type of the moderated content is block, the overall result is block.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The moderation result of the title.</p>
         */
        @NameInMap("TitleCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult titleCensorResult;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>example userdata ****</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The moderation results of the video.</p>
         */
        @NameInMap("VensorCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult vensorCensorResult;

        /**
         * <p>The video moderation configurations.</p>
         */
        @NameInMap("VideoCensorConfig")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig videoCensorConfig;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setAudioCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult audioCensorResult) {
            this.audioCensorResult = audioCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailAudioCensorResult getAudioCensorResult() {
            return this.audioCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setBarrageCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCoverImageCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults coverImageCensorResults) {
            this.coverImageCensorResults = coverImageCensorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setDescCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setInput(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput getInput() {
            return this.input;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setTitleCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setVensorCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult vensorCensorResult) {
            this.vensorCensorResult = vensorCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setVideoCensorConfig(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig videoCensorConfig) {
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

    }

}
