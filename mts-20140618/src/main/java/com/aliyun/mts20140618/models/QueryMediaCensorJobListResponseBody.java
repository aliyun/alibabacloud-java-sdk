// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobListResponseBody extends TeaModel {
    /**
     * <p>The content moderation jobs.</p>
     */
    @NameInMap("MediaCensorJobList")
    public QueryMediaCensorJobListResponseBodyMediaCensorJobList mediaCensorJobList;

    /**
     * <p>The token that is used to retrieve the next page of the query results. The value is a UUID that contains 32 characters. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
     * 
     * <strong>example:</strong>
     * <p>9b1a42bc6e8d46e6a1383b7e7f01****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The IDs of the jobs that do not exist. This parameter is not returned if all specified jobs are found.</p>
     */
    @NameInMap("NonExistIds")
    public QueryMediaCensorJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaCensorJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobListResponseBody self = new QueryMediaCensorJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobListResponseBody setMediaCensorJobList(QueryMediaCensorJobListResponseBodyMediaCensorJobList mediaCensorJobList) {
        this.mediaCensorJobList = mediaCensorJobList;
        return this;
    }
    public QueryMediaCensorJobListResponseBodyMediaCensorJobList getMediaCensorJobList() {
        return this.mediaCensorJobList;
    }

    public QueryMediaCensorJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMediaCensorJobListResponseBody setNonExistIds(QueryMediaCensorJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryMediaCensorJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryMediaCensorJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
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
         * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,).</p>
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
         * <p>normal</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The score. Valid values: 0 to 100.</p>
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
         * <li><strong>logo</strong>: special logo moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>live</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The overall result of the job. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The content passes the moderation.</li>
         * <li><strong>review</strong>: The content needs to be manually reviewed again.</li>
         * <li><strong>block</strong>: The content needs to be blocked.</li>
         * </ul>
         * <blockquote>
         * <p>If the moderation result of any type of the moderated content is review, the overall result is review. If the moderation result of any type of the moderated content is block, the overall result is block.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> result;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults setResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> getResult() {
            return this.result;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult extends TeaModel {
        /**
         * <p>The OSS bucket that stores the video thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p>example-Bucket-****</p>
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
         * <p>The moderation results of the content moderation jobs.</p>
         */
        @NameInMap("Results")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults results;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults results) {
            this.results = results;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults getResults() {
            return this.results;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults extends TeaModel {
        @NameInMap("CoverImageCensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults setCoverImageCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult) {
            this.coverImageCensorResult = coverImageCensorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
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
         * <p>ad</p>
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
         * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-test-in-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>test/ai/censor/test-****.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,).</p>
         * <ul>
         * <li><strong>normal</strong>: normal content</li>
         * <li><strong>spam</strong>: spam</li>
         * <li><strong>ad</strong>: ads</li>
         * <li><strong>abuse</strong>: abuse content</li>
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
         * <p>The moderation scenario. The value is <strong>antispam</strong>.</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,).</p>
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
         * <li><strong>logo</strong>: special logo moderation</li>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults setCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult extends TeaModel {
        /**
         * <p>The labels of the moderation result. Separate multiple labels with commas (,). Valid values:</p>
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
         * <p>normal</p>
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
         * <li><strong>logo</strong>: special logo moderation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pron</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults setCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline extends TeaModel {
        /**
         * <p>The moderation results that include information such as labels and scores.</p>
         */
        @NameInMap("CensorResults")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults;

        /**
         * <p>The OSS object that is generated as the output snapshot.</p>
         * <blockquote>
         * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg, output00002-****.jpg</code>, and so on.</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines extends TeaModel {
        @NameInMap("VideoTimeline")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines setVideoTimeline(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline) {
            this.videoTimeline = videoTimeline;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult extends TeaModel {
        /**
         * <p>A collection of the moderation results. The information includes the summary about various scenarios such as pornographic content and terrorist content.</p>
         */
        @NameInMap("CensorResults")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults censorResults;

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
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
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines videoTimelines;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setVideoTimelines(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines videoTimelines) {
            this.videoTimelines = videoTimelines;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile extends TeaModel {
        /**
         * <p>The OSS bucket that stores the output snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the OSS bucket for storing the output snapshot resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The one or more OSS objects that are generated as the output snapshots.</p>
         * <blockquote>
         * <p>In the example, {Count} is a placeholder. The OSS objects that are generated as output snapshots are named <code>output00001-****.jpg, output00002-****.jpg</code>, and so on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>output{Count}.jpg</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig extends TeaModel {
        /**
         * <p>The moderation template. Default value: common. The default value indicates that the default template is used.</p>
         * <blockquote>
         * <p>If the moderation template is not specified, the default value common is returned. If a custom moderation template that is created by submitting a ticket is specified, a user ID is returned.</p>
         * </blockquote>
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
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile outputFile;

        /**
         * <p>Indicates whether the video content needs to be moderated. Default value: true. Valid values:</p>
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

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setOutputFile(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setVideoCensor(String videoCensor) {
            this.videoCensor = videoCensor;
            return this;
        }
        public String getVideoCensor() {
            return this.videoCensor;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob extends TeaModel {
        @NameInMap("AudioCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult audioCensorResult;

        /**
         * <p>The moderation result of live comments.</p>
         */
        @NameInMap("BarrageCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult barrageCensorResult;

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
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults coverImageCensorResults;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-04T07:25:48Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The moderation result of the description.</p>
         */
        @NameInMap("DescCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult descCensorResult;

        /**
         * <p>The time when the job was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-04T07:25:48Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput input;

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
         * <p>The ID of the MPS queue that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b30b7c0d0e4a0abde1d5f9e751****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

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

        /**
         * <p>The moderation result of the title.</p>
         */
        @NameInMap("TitleCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult titleCensorResult;

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
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult vensorCensorResult;

        /**
         * <p>The video moderation configurations.</p>
         */
        @NameInMap("VideoCensorConfig")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig videoCensorConfig;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setAudioCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult audioCensorResult) {
            this.audioCensorResult = audioCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobAudioCensorResult getAudioCensorResult() {
            return this.audioCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setBarrageCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCoverImageCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults coverImageCensorResults) {
            this.coverImageCensorResults = coverImageCensorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setDescCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setInput(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput getInput() {
            return this.input;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setTitleCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setVensorCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult vensorCensorResult) {
            this.vensorCensorResult = vensorCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setVideoCensorConfig(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig videoCensorConfig) {
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobList extends TeaModel {
        @NameInMap("MediaCensorJob")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> mediaCensorJob;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobList self = new QueryMediaCensorJobListResponseBodyMediaCensorJobList();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobList setMediaCensorJob(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> mediaCensorJob) {
            this.mediaCensorJob = mediaCensorJob;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> getMediaCensorJob() {
            return this.mediaCensorJob;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaCensorJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyNonExistIds self = new QueryMediaCensorJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
