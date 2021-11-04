// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMcuJobResponseBody extends TeaModel {
    @NameInMap("JobResult")
    public QueryMcuJobResponseBodyJobResult jobResult;

    @NameInMap("NonExistJobIds")
    public QueryMcuJobResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMcuJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMcuJobResponseBody self = new QueryMcuJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMcuJobResponseBody setJobResult(QueryMcuJobResponseBodyJobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public QueryMcuJobResponseBodyJobResult getJobResult() {
        return this.jobResult;
    }

    public QueryMcuJobResponseBody setNonExistJobIds(QueryMcuJobResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryMcuJobResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryMcuJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SpeechRate")
        public String speechRate;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Text")
        public String text;

        public static QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText self = new QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText setSpeechRate(String speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public String getSpeechRate() {
            return this.speechRate;
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList extends TeaModel {
        @NameInMap("AsrText")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText> asrText;

        public static QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList self = new QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList setAsrText(java.util.List<QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText> asrText) {
            this.asrText = asrText;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextListAsrText> getAsrText() {
            return this.asrText;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobAsrResult extends TeaModel {
        @NameInMap("AsrTextList")
        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList asrTextList;

        @NameInMap("Duration")
        public String duration;

        public static QueryMcuJobResponseBodyJobResultJobAsrResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobAsrResult self = new QueryMcuJobResponseBodyJobResultJobAsrResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResult setAsrTextList(QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList asrTextList) {
            this.asrTextList = asrTextList;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobAsrResultAsrTextList getAsrTextList() {
            return this.asrTextList;
        }

        public QueryMcuJobResponseBodyJobResultJobAsrResult setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Score")
        public String score;

        public static QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory self = new QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobCategoryResultCategories extends TeaModel {
        @NameInMap("Category")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory> category;

        public static QueryMcuJobResponseBodyJobResultJobCategoryResultCategories build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobCategoryResultCategories self = new QueryMcuJobResponseBodyJobResultJobCategoryResultCategories();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobCategoryResultCategories setCategory(java.util.List<QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory> category) {
            this.category = category;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobCategoryResultCategoriesCategory> getCategory() {
            return this.category;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobCategoryResult extends TeaModel {
        @NameInMap("Categories")
        public QueryMcuJobResponseBodyJobResultJobCategoryResultCategories categories;

        @NameInMap("Details")
        public String details;

        public static QueryMcuJobResponseBodyJobResultJobCategoryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobCategoryResult self = new QueryMcuJobResponseBodyJobResultJobCategoryResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobCategoryResult setCategories(QueryMcuJobResponseBodyJobResultJobCategoryResultCategories categories) {
            this.categories = categories;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobCategoryResultCategories getCategories() {
            return this.categories;
        }

        public QueryMcuJobResponseBodyJobResultJobCategoryResult setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public String score;

        @NameInMap("Target")
        public String target;

        public static QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity self = new QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities extends TeaModel {
        @NameInMap("Celebrity")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity> celebrity;

        public static QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities self = new QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities setCelebrity(java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity> celebrity) {
            this.celebrity = celebrity;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebritiesCelebrity> getCelebrity() {
            return this.celebrity;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobFaceResultFace extends TeaModel {
        @NameInMap("Celebrities")
        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities celebrities;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Time")
        public String time;

        public static QueryMcuJobResponseBodyJobResultJobFaceResultFace build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobFaceResultFace self = new QueryMcuJobResponseBodyJobResultJobFaceResultFace();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFace setCelebrities(QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities celebrities) {
            this.celebrities = celebrities;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobFaceResultFaceCelebrities getCelebrities() {
            return this.celebrities;
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFace setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFace setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResultFace setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobFaceResult extends TeaModel {
        @NameInMap("Face")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFace> face;

        public static QueryMcuJobResponseBodyJobResultJobFaceResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobFaceResult self = new QueryMcuJobResponseBodyJobResultJobFaceResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobFaceResult setFace(java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFace> face) {
            this.face = face;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobFaceResultFace> getFace() {
            return this.face;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryMcuJobResponseBodyJobResultJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobInput self = new QueryMcuJobResponseBodyJobResultJobInput();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMcuJobResponseBodyJobResultJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMcuJobResponseBodyJobResultJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobOcrResultOcr extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("OcrText")
        public String ocrText;

        @NameInMap("Time")
        public String time;

        public static QueryMcuJobResponseBodyJobResultJobOcrResultOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobOcrResultOcr self = new QueryMcuJobResponseBodyJobResultJobOcrResultOcr();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobOcrResultOcr setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryMcuJobResponseBodyJobResultJobOcrResultOcr setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryMcuJobResponseBodyJobResultJobOcrResultOcr setOcrText(String ocrText) {
            this.ocrText = ocrText;
            return this;
        }
        public String getOcrText() {
            return this.ocrText;
        }

        public QueryMcuJobResponseBodyJobResultJobOcrResultOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobOcrResult extends TeaModel {
        @NameInMap("Ocr")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobOcrResultOcr> ocr;

        public static QueryMcuJobResponseBodyJobResultJobOcrResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobOcrResult self = new QueryMcuJobResponseBodyJobResultJobOcrResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobOcrResult setOcr(java.util.List<QueryMcuJobResponseBodyJobResultJobOcrResultOcr> ocr) {
            this.ocr = ocr;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobOcrResultOcr> getOcr() {
            return this.ocr;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Type")
        public String type;

        public static QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask self = new QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobSubTaskInfo extends TeaModel {
        @NameInMap("SubTask")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask> subTask;

        public static QueryMcuJobResponseBodyJobResultJobSubTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobSubTaskInfo self = new QueryMcuJobResponseBodyJobResultJobSubTaskInfo();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobSubTaskInfo setSubTask(java.util.List<QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask> subTask) {
            this.subTask = subTask;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobSubTaskInfoSubTask> getSubTask() {
            return this.subTask;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public String score;

        @NameInMap("Tag")
        public String tag;

        public static QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo self = new QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos extends TeaModel {
        @NameInMap("FrameTagInfo")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo> frameTagInfo;

        public static QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos self = new QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos setFrameTagInfo(java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo> frameTagInfo) {
            this.frameTagInfo = frameTagInfo;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfosFrameTagInfo> getFrameTagInfo() {
            return this.frameTagInfo;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobTagResultTag extends TeaModel {
        @NameInMap("FrameTagInfos")
        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos frameTagInfos;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Time")
        public String time;

        public static QueryMcuJobResponseBodyJobResultJobTagResultTag build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobTagResultTag self = new QueryMcuJobResponseBodyJobResultJobTagResultTag();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTag setFrameTagInfos(QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos frameTagInfos) {
            this.frameTagInfos = frameTagInfos;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobTagResultTagFrameTagInfos getFrameTagInfos() {
            return this.frameTagInfos;
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTag setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTag setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryMcuJobResponseBodyJobResultJobTagResultTag setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJobTagResult extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTag> tag;

        public static QueryMcuJobResponseBodyJobResultJobTagResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJobTagResult self = new QueryMcuJobResponseBodyJobResultJobTagResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJobTagResult setTag(java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJobTagResultTag> getTag() {
            return this.tag;
        }

    }

    public static class QueryMcuJobResponseBodyJobResultJob extends TeaModel {
        @NameInMap("AsrResult")
        public QueryMcuJobResponseBodyJobResultJobAsrResult asrResult;

        @NameInMap("CategoryResult")
        public QueryMcuJobResponseBodyJobResultJobCategoryResult categoryResult;

        @NameInMap("FaceResult")
        public QueryMcuJobResponseBodyJobResultJobFaceResult faceResult;

        @NameInMap("Input")
        public QueryMcuJobResponseBodyJobResultJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("OcrResult")
        public QueryMcuJobResponseBodyJobResultJobOcrResult ocrResult;

        @NameInMap("SubTaskInfo")
        public QueryMcuJobResponseBodyJobResultJobSubTaskInfo subTaskInfo;

        @NameInMap("TagResult")
        public QueryMcuJobResponseBodyJobResultJobTagResult tagResult;

        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UserData")
        public String userData;

        public static QueryMcuJobResponseBodyJobResultJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResultJob self = new QueryMcuJobResponseBodyJobResultJob();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResultJob setAsrResult(QueryMcuJobResponseBodyJobResultJobAsrResult asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobAsrResult getAsrResult() {
            return this.asrResult;
        }

        public QueryMcuJobResponseBodyJobResultJob setCategoryResult(QueryMcuJobResponseBodyJobResultJobCategoryResult categoryResult) {
            this.categoryResult = categoryResult;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobCategoryResult getCategoryResult() {
            return this.categoryResult;
        }

        public QueryMcuJobResponseBodyJobResultJob setFaceResult(QueryMcuJobResponseBodyJobResultJobFaceResult faceResult) {
            this.faceResult = faceResult;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobFaceResult getFaceResult() {
            return this.faceResult;
        }

        public QueryMcuJobResponseBodyJobResultJob setInput(QueryMcuJobResponseBodyJobResultJobInput input) {
            this.input = input;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobInput getInput() {
            return this.input;
        }

        public QueryMcuJobResponseBodyJobResultJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMcuJobResponseBodyJobResultJob setOcrResult(QueryMcuJobResponseBodyJobResultJobOcrResult ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobOcrResult getOcrResult() {
            return this.ocrResult;
        }

        public QueryMcuJobResponseBodyJobResultJob setSubTaskInfo(QueryMcuJobResponseBodyJobResultJobSubTaskInfo subTaskInfo) {
            this.subTaskInfo = subTaskInfo;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobSubTaskInfo getSubTaskInfo() {
            return this.subTaskInfo;
        }

        public QueryMcuJobResponseBodyJobResultJob setTagResult(QueryMcuJobResponseBodyJobResultJobTagResult tagResult) {
            this.tagResult = tagResult;
            return this;
        }
        public QueryMcuJobResponseBodyJobResultJobTagResult getTagResult() {
            return this.tagResult;
        }

        public QueryMcuJobResponseBodyJobResultJob setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public QueryMcuJobResponseBodyJobResultJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryMcuJobResponseBodyJobResultJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMcuJobResponseBodyJobResult extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryMcuJobResponseBodyJobResultJob> job;

        public static QueryMcuJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyJobResult self = new QueryMcuJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyJobResult setJob(java.util.List<QueryMcuJobResponseBodyJobResultJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryMcuJobResponseBodyJobResultJob> getJob() {
            return this.job;
        }

    }

    public static class QueryMcuJobResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMcuJobResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMcuJobResponseBodyNonExistJobIds self = new QueryMcuJobResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryMcuJobResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
