// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011;

import com.aliyun.tea.*;
import com.aliyun.chatbot20171011.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("chatbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public ActivatePerspectiveResponse activatePerspectiveWithOptions(ActivatePerspectiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActivatePerspective", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ActivatePerspectiveResponse());
    }

    public ActivatePerspectiveResponse activatePerspective(ActivatePerspectiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activatePerspectiveWithOptions(request, runtime);
    }

    public AddSynonymResponse addSynonymWithOptions(AddSynonymRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSynonym", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddSynonymResponse());
    }

    public AddSynonymResponse addSynonym(AddSynonymRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSynonymWithOptions(request, runtime);
    }

    public AppendEntityMemberResponse appendEntityMemberWithOptions(AppendEntityMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AppendEntityMember", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new AppendEntityMemberResponse());
    }

    public AppendEntityMemberResponse appendEntityMember(AppendEntityMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.appendEntityMemberWithOptions(request, runtime);
    }

    public AssociateResponse associateWithOptions(AssociateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Associate", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateResponse());
    }

    public AssociateResponse associate(AssociateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateWithOptions(request, runtime);
    }

    public ChatResponse chatWithOptions(ChatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Chat", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ChatResponse());
    }

    public ChatResponse chat(ChatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.chatWithOptions(request, runtime);
    }

    public CreateBotResponse createBotWithOptions(CreateBotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBot", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBotResponse());
    }

    public CreateBotResponse createBot(CreateBotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBotWithOptions(request, runtime);
    }

    public CreateCategoryResponse createCategoryWithOptions(CreateCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCategory", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCategoryResponse());
    }

    public CreateCategoryResponse createCategory(CreateCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCategoryWithOptions(request, runtime);
    }

    public CreateCoreWordResponse createCoreWordWithOptions(CreateCoreWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCoreWord", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCoreWordResponse());
    }

    public CreateCoreWordResponse createCoreWord(CreateCoreWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCoreWordWithOptions(request, runtime);
    }

    public CreateDialogResponse createDialogWithOptions(CreateDialogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDialog", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDialogResponse());
    }

    public CreateDialogResponse createDialog(CreateDialogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDialogWithOptions(request, runtime);
    }

    public CreateEntityResponse createEntityWithOptions(CreateEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEntity", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEntityResponse());
    }

    public CreateEntityResponse createEntity(CreateEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEntityWithOptions(request, runtime);
    }

    public CreateIntentResponse createIntentWithOptions(CreateIntentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIntent", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIntentResponse());
    }

    public CreateIntentResponse createIntent(CreateIntentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntentWithOptions(request, runtime);
    }

    public CreateKnowledgeResponse createKnowledgeWithOptions(CreateKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateKnowledge", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateKnowledgeResponse());
    }

    public CreateKnowledgeResponse createKnowledge(CreateKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createKnowledgeWithOptions(request, runtime);
    }

    public DeleteBotResponse deleteBotWithOptions(DeleteBotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBot", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBotResponse());
    }

    public DeleteBotResponse deleteBot(DeleteBotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBotWithOptions(request, runtime);
    }

    public DeleteCategoryResponse deleteCategoryWithOptions(DeleteCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCategory", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCategoryResponse());
    }

    public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCategoryWithOptions(request, runtime);
    }

    public DeleteCoreWordResponse deleteCoreWordWithOptions(DeleteCoreWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCoreWord", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCoreWordResponse());
    }

    public DeleteCoreWordResponse deleteCoreWord(DeleteCoreWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCoreWordWithOptions(request, runtime);
    }

    public DeleteDialogResponse deleteDialogWithOptions(DeleteDialogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDialog", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDialogResponse());
    }

    public DeleteDialogResponse deleteDialog(DeleteDialogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDialogWithOptions(request, runtime);
    }

    public DeleteEntityResponse deleteEntityWithOptions(DeleteEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEntity", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEntityResponse());
    }

    public DeleteEntityResponse deleteEntity(DeleteEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEntityWithOptions(request, runtime);
    }

    public DeleteIntentResponse deleteIntentWithOptions(DeleteIntentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIntent", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIntentResponse());
    }

    public DeleteIntentResponse deleteIntent(DeleteIntentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIntentWithOptions(request, runtime);
    }

    public DeleteKnowledgeResponse deleteKnowledgeWithOptions(DeleteKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteKnowledge", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteKnowledgeResponse());
    }

    public DeleteKnowledgeResponse deleteKnowledge(DeleteKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteKnowledgeWithOptions(request, runtime);
    }

    public DescribeBotResponse describeBotWithOptions(DescribeBotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBot", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBotResponse());
    }

    public DescribeBotResponse describeBot(DescribeBotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBotWithOptions(request, runtime);
    }

    public DescribeCategoryResponse describeCategoryWithOptions(DescribeCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCategory", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCategoryResponse());
    }

    public DescribeCategoryResponse describeCategory(DescribeCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCategoryWithOptions(request, runtime);
    }

    public DescribeCoreWordResponse describeCoreWordWithOptions(DescribeCoreWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCoreWord", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCoreWordResponse());
    }

    public DescribeCoreWordResponse describeCoreWord(DescribeCoreWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCoreWordWithOptions(request, runtime);
    }

    public DescribeDialogResponse describeDialogWithOptions(DescribeDialogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDialog", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDialogResponse());
    }

    public DescribeDialogResponse describeDialog(DescribeDialogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDialogWithOptions(request, runtime);
    }

    public DescribePerspectiveResponse describePerspectiveWithOptions(DescribePerspectiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePerspective", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePerspectiveResponse());
    }

    public DescribePerspectiveResponse describePerspective(DescribePerspectiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePerspectiveWithOptions(request, runtime);
    }

    public DisableDialogFlowResponse disableDialogFlowWithOptions(DisableDialogFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDialogFlow", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDialogFlowResponse());
    }

    public DisableDialogFlowResponse disableDialogFlow(DisableDialogFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDialogFlowWithOptions(request, runtime);
    }

    public DisableKnowledgeResponse disableKnowledgeWithOptions(DisableKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableKnowledge", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new DisableKnowledgeResponse());
    }

    public DisableKnowledgeResponse disableKnowledge(DisableKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableKnowledgeWithOptions(request, runtime);
    }

    public FeedbackResponse feedbackWithOptions(FeedbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Feedback", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new FeedbackResponse());
    }

    public FeedbackResponse feedback(FeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.feedbackWithOptions(request, runtime);
    }

    public GetBotChatDataResponse getBotChatDataWithOptions(GetBotChatDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBotChatData", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBotChatDataResponse());
    }

    public GetBotChatDataResponse getBotChatData(GetBotChatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBotChatDataWithOptions(request, runtime);
    }

    public GetBotDsStatDataResponse getBotDsStatDataWithOptions(GetBotDsStatDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBotDsStatData", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBotDsStatDataResponse());
    }

    public GetBotDsStatDataResponse getBotDsStatData(GetBotDsStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBotDsStatDataWithOptions(request, runtime);
    }

    public GetBotKnowledgeStatDataResponse getBotKnowledgeStatDataWithOptions(GetBotKnowledgeStatDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBotKnowledgeStatData", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBotKnowledgeStatDataResponse());
    }

    public GetBotKnowledgeStatDataResponse getBotKnowledgeStatData(GetBotKnowledgeStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBotKnowledgeStatDataWithOptions(request, runtime);
    }

    public GetBotSessionDataResponse getBotSessionDataWithOptions(GetBotSessionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBotSessionData", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetBotSessionDataResponse());
    }

    public GetBotSessionDataResponse getBotSessionData(GetBotSessionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBotSessionDataWithOptions(request, runtime);
    }

    public GetConversationListResponse getConversationListWithOptions(GetConversationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConversationList", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetConversationListResponse());
    }

    public GetConversationListResponse getConversationList(GetConversationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConversationListWithOptions(request, runtime);
    }

    public ListBotChatHistorysResponse listBotChatHistorysWithOptions(ListBotChatHistorysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotChatHistorys", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotChatHistorysResponse());
    }

    public ListBotChatHistorysResponse listBotChatHistorys(ListBotChatHistorysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotChatHistorysWithOptions(request, runtime);
    }

    public ListBotColdDsDatasResponse listBotColdDsDatasWithOptions(ListBotColdDsDatasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotColdDsDatas", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotColdDsDatasResponse());
    }

    public ListBotColdDsDatasResponse listBotColdDsDatas(ListBotColdDsDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotColdDsDatasWithOptions(request, runtime);
    }

    public ListBotColdKnowledgesResponse listBotColdKnowledgesWithOptions(ListBotColdKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotColdKnowledges", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotColdKnowledgesResponse());
    }

    public ListBotColdKnowledgesResponse listBotColdKnowledges(ListBotColdKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotColdKnowledgesWithOptions(request, runtime);
    }

    public ListBotDsDetailsResponse listBotDsDetailsWithOptions(ListBotDsDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotDsDetails", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotDsDetailsResponse());
    }

    public ListBotDsDetailsResponse listBotDsDetails(ListBotDsDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotDsDetailsWithOptions(request, runtime);
    }

    public ListBotHotDsDatasResponse listBotHotDsDatasWithOptions(ListBotHotDsDatasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotHotDsDatas", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotHotDsDatasResponse());
    }

    public ListBotHotDsDatasResponse listBotHotDsDatas(ListBotHotDsDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotHotDsDatasWithOptions(request, runtime);
    }

    public ListBotHotKnowledgesResponse listBotHotKnowledgesWithOptions(ListBotHotKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotHotKnowledges", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotHotKnowledgesResponse());
    }

    public ListBotHotKnowledgesResponse listBotHotKnowledges(ListBotHotKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotHotKnowledgesWithOptions(request, runtime);
    }

    public ListBotKnowledgeDetailsResponse listBotKnowledgeDetailsWithOptions(ListBotKnowledgeDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotKnowledgeDetails", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotKnowledgeDetailsResponse());
    }

    public ListBotKnowledgeDetailsResponse listBotKnowledgeDetails(ListBotKnowledgeDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotKnowledgeDetailsWithOptions(request, runtime);
    }

    public ListBotReceptionDetailDatasResponse listBotReceptionDetailDatasWithOptions(ListBotReceptionDetailDatasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBotReceptionDetailDatas", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListBotReceptionDetailDatasResponse());
    }

    public ListBotReceptionDetailDatasResponse listBotReceptionDetailDatas(ListBotReceptionDetailDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBotReceptionDetailDatasWithOptions(request, runtime);
    }

    public ListConversationLogsResponse listConversationLogsWithOptions(ListConversationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConversationLogs", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new ListConversationLogsResponse());
    }

    public ListConversationLogsResponse listConversationLogs(ListConversationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConversationLogsWithOptions(request, runtime);
    }

    public MoveKnowledgeCategoryResponse moveKnowledgeCategoryWithOptions(MoveKnowledgeCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveKnowledgeCategory", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new MoveKnowledgeCategoryResponse());
    }

    public MoveKnowledgeCategoryResponse moveKnowledgeCategory(MoveKnowledgeCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveKnowledgeCategoryWithOptions(request, runtime);
    }

    public PublishDialogFlowResponse publishDialogFlowWithOptions(PublishDialogFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishDialogFlow", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new PublishDialogFlowResponse());
    }

    public PublishDialogFlowResponse publishDialogFlow(PublishDialogFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishDialogFlowWithOptions(request, runtime);
    }

    public PublishKnowledgeResponse publishKnowledgeWithOptions(PublishKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishKnowledge", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new PublishKnowledgeResponse());
    }

    public PublishKnowledgeResponse publishKnowledge(PublishKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishKnowledgeWithOptions(request, runtime);
    }

    public QueryBotsResponse queryBotsWithOptions(QueryBotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBots", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBotsResponse());
    }

    public QueryBotsResponse queryBots(QueryBotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBotsWithOptions(request, runtime);
    }

    public QueryDialogsResponse queryDialogsWithOptions(QueryDialogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDialogs", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDialogsResponse());
    }

    public QueryDialogsResponse queryDialogs(QueryDialogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDialogsWithOptions(request, runtime);
    }

    public QueryPerspectivesResponse queryPerspectivesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryPerspectives", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPerspectivesResponse());
    }

    public QueryPerspectivesResponse queryPerspectives() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPerspectivesWithOptions(runtime);
    }

    public QuerySystemEntitiesResponse querySystemEntitiesWithOptions(QuerySystemEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySystemEntities", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySystemEntitiesResponse());
    }

    public QuerySystemEntitiesResponse querySystemEntities(QuerySystemEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySystemEntitiesWithOptions(request, runtime);
    }

    public RemoveEntityMemberResponse removeEntityMemberWithOptions(RemoveEntityMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEntityMember", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEntityMemberResponse());
    }

    public RemoveEntityMemberResponse removeEntityMember(RemoveEntityMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEntityMemberWithOptions(request, runtime);
    }

    public RemoveSynonymResponse removeSynonymWithOptions(RemoveSynonymRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSynonym", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSynonymResponse());
    }

    public RemoveSynonymResponse removeSynonym(RemoveSynonymRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSynonymWithOptions(request, runtime);
    }

    public TestDialogFlowResponse testDialogFlowWithOptions(TestDialogFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestDialogFlow", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new TestDialogFlowResponse());
    }

    public TestDialogFlowResponse testDialogFlow(TestDialogFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testDialogFlowWithOptions(request, runtime);
    }

    public UpdateCategoryResponse updateCategoryWithOptions(UpdateCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCategory", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCategoryResponse());
    }

    public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCategoryWithOptions(request, runtime);
    }

    public UpdateCoreWordResponse updateCoreWordWithOptions(UpdateCoreWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCoreWord", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCoreWordResponse());
    }

    public UpdateCoreWordResponse updateCoreWord(UpdateCoreWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCoreWordWithOptions(request, runtime);
    }

    public UpdateDialogResponse updateDialogWithOptions(UpdateDialogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDialog", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDialogResponse());
    }

    public UpdateDialogResponse updateDialog(UpdateDialogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDialogWithOptions(request, runtime);
    }

    public UpdateDialogFlowResponse updateDialogFlowWithOptions(UpdateDialogFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDialogFlow", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDialogFlowResponse());
    }

    public UpdateDialogFlowResponse updateDialogFlow(UpdateDialogFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDialogFlowWithOptions(request, runtime);
    }

    public UpdateEntityResponse updateEntityWithOptions(UpdateEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEntity", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEntityResponse());
    }

    public UpdateEntityResponse updateEntity(UpdateEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEntityWithOptions(request, runtime);
    }

    public UpdateIntentResponse updateIntentWithOptions(UpdateIntentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIntent", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIntentResponse());
    }

    public UpdateIntentResponse updateIntent(UpdateIntentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIntentWithOptions(request, runtime);
    }

    public UpdateKnowledgeResponse updateKnowledgeWithOptions(UpdateKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateKnowledge", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateKnowledgeResponse());
    }

    public UpdateKnowledgeResponse updateKnowledge(UpdateKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateKnowledgeWithOptions(request, runtime);
    }

    public UpdatePerspectiveResponse updatePerspectiveWithOptions(UpdatePerspectiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePerspective", "2017-10-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePerspectiveResponse());
    }

    public UpdatePerspectiveResponse updatePerspective(UpdatePerspectiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePerspectiveWithOptions(request, runtime);
    }
}
